/* This program will print the following pattern:- 
                    1    
                    21   
                    321  
                    4321 
                    54321
*/

import java.util.Scanner;
class Pattern4 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--)
                System.out.print(j);
            System.out.println();
        }
    }    
}
