/* Program will print following series:- 
               9,99,999,9999,.....
                    Logic used here:
                        term:  9      99     999      9999
                        count: 1      2       3         4
                    */
import java.util.Scanner;
class Series{
    public static void main(String args[]){
        int p,t1,c1,t2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms:- ");
        p=sc.nextInt();
        t1=9;c1=t2=1;
        while(c1<=p){
            System.out.print(t1 + " ,");
            t2*=10;
            c1++;
            t1=t1+(9*t2);
        }
        System.out.println("\b ");//used to backspace last comma(,) . \b is backspace and space will replace the last comma
    }

}
