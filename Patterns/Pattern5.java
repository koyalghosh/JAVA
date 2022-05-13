/*This program will print the following pattern:-
                    12345
                    1234 
                    123  
                    12   
                    1   
*/
import java.util.Scanner;
class Pattern5 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(j);
            System.out.println();
        }
    }    
}
