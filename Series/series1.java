/* Program will print following series:- 
        1,3,5,7,9,........
                    Logic used here:
                        term:  1     3      5       7
                        count: 1     2      3       4
                    */
import java.util.Scanner;
class Series{
    public static void main(String args[]){
        int n,term,cnt;
        System.out.print("Enter number of terms:- ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        cnt=term=1;
        while(cnt<=n){
            System.out.print(term + ",");
            term+=2;
            cnt++;
        }
        System.out.println("\b ");//used to backspace last comma(,) . \b is backspace and space will replace the last comma
    }

}
