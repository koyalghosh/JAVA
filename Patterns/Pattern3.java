/*This program will print the following output:- 
                    1    
                    22   
                    333  
                    4444 
                    55555
*/

import java.util.Scanner;
class Pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows:- ");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(i);
            System.out.println();
        }
    }
}
