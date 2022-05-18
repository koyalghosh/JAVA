/*  CONSOLE CLASS:- Used to take input.
            * POINTS  TO  REMEMBER:     
                ->No problem of fflush as like in Scanner class
                ->Can take password input without displaying
                ->It is an singleton class i.e only one object .
                ->Object creation is done by console() function
                ->Console class read every variable as String so we have to convert them if needed. 
*/
import java.io.Console;
class ConsoleClass {
    public static void main(String ... args){
        Console con=System.console();
        System.out.print("Enter first number:- ");
        int a=Integer.parseInt(con.readLine());
        System.out.print("Enter second number:- ");
        int b=Integer.parseInt(con.readLine());
        int sum=a+b;
        System.out.print("Sum is " + sum);
    }
}
