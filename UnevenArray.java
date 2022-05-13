/*Uneven array or zig-zag array:-  A matrix(2D array) whose size is not fixed i.e have fixed rows but not columns*/
import java.util.Scanner;
public class UnevenArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students:- ");
        int r,c;
        r=sc.nextInt();
        int m[][];
        m=new int[r][];
        //INPUT
        for(int i=0;i<r;i++){
            System.out.print("Enter no. of subjects cleared by student " + (i+1) + " : ");
            c=sc.nextInt();
            m[i]=new int[c];
            for(int j=0;j<c;j++){
                System.out.print("Enter number in " + (j+1) + " subject:- ");
                m[i][j]=sc.nextInt();
            }
        }
        
        //OUTPUT
        System.out.println("Students result:- ");
        for(int x[]:m){
            for(int e:x)
                System.out.print(e + "\t");
            System.out.println();
        }
    }
}
