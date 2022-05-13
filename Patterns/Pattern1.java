/* Program will print the following output:-
        1
        12
        123 
        1234
*/

import java.util.Scanner;
class Pattern1{
        public static void main(String args[]){
            int i,j,n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of rows:- ");
            n=sc.nextInt();
            for(i=0;i<=n;i++){
                for(j=1;j<=i;j++)
                    System.out.print(j);
                System.out.println();
            }
        }
    }
