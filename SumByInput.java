import java.util.Scanner;
class SumByInput {
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);//sc is a object of class Scanner and System.in means taking input from keyboard
        int a,b,sum;
        System.out.print("Enter first num:- ");
        a=sc.nextInt();//this is a predefined function of class scanner to take integer input
        System.out.print("Enter second num:- ");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum is "+sum);
    }   
}
