/* This is a stack program .
 * This program is about how to create your own exception and how to print your own exception.
 * It is not compulsory to extend Exception class(java.lang.Exception) we can extend RuntimeException class
 (java.lang.RuntimeException) or Throwable class(java.lang.Throwable)but its better to not use
 Throwable because it contains Error class(java.lang.Error) too.
 There are 2 types of Exception:
    Checked Exception          |         Unchecked Exception
    catch or throws anyone of  |    catch and throw both are 
    them is compulsory.        |    optional.
    e.g: IOException           |    e.g. AirthmaticException
 */
import java.util.Scanner;
class UnderFlowException extends Exception{
    UnderFlowException(String msg){
        super(msg);
    }
}
class OverFlowException extends Exception{
    OverFlowException(String msg){
        super(msg);
    }
}
class Stack {
    int maxstk=5;
    int stack[]=new int[maxstk];
    private int top=-1;
    void push(int item) throws OverFlowException{//throws means we are informing that this function can throw these Exceptions
        if(top==maxstk-1)
            throw new OverFlowException("STACK OVERFLOW");//throw means throwing Exception
        top++;
        stack[top]=item;
    }
    int pop() throws UnderFlowException{
        if(top==-1)
            throw new UnderFlowException("STACK UNDERFLOW");
        int item=stack[top];
        top--;
        return item;
    }
    void display() throws UnderFlowException{
        if(top==-1)
            throw new UnderFlowException("No item left to display");
        for(int i=0;i<=top;i++)
            System.out.println(stack[i]);
    }
}
class StackTest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack s1=new Stack();
            while(true){
                System.out.print("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\nENTER YOUR CHOICE: ");
                int ch=sc.nextInt();
                switch(ch){
                    case 1:
                        try{//try block contains problem prone statements and their linked statements
                            System.out.print("Enter item to insert:- ");
                            int item=sc.nextInt();
                            s1.push(item);  
                        }
                        catch(OverFlowException e){//catch the exception
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try{
                            int num=s1.pop();
                            System.out.println("Popped item is "+num);
                        }
                        catch(UnderFlowException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try{
                            System.out.println("Items in stack are: ");
                            s1.display();
                        }
                        catch(UnderFlowException e){//one try can have multiple catch
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Enter correct choice.");
                }
            }
    }
}
