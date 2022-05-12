/* Program will print following series:- 
            1,-3,5,-7,........
                 Logic used here:
                        term:  1     -3      5       -7
                        count: 1      2      3        4
                    */
import java.util.Scanner;
class Series2{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms:- ");
        int c,t,m;
        m=sc.nextInt();
        c=t=1;
        while(c<=m){
            if(c%2==0)
                System.out.print(-t + " ,");
            else
                System.out.print(t + " ,");
            t+=2;
            c++;
        }
       System.out.println("\b ");//used to backspace last comma(,) . \b is backspace and space will replace the last comma
    }

}
