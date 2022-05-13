/*This program will find out if the array is in increasing order or decreasing order or unsorted. */

import java.util.Scanner;

class Array1{
    public static void main(String args[]){
        int n,a[],i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter " + (i+1) + " element:- ");
            a[i]=sc.nextInt();
        }
        i=0;
        boolean flag=true;
        if(a[i]>a[i+1]){
            while(i!=n-1){
                if(a[i]>a[i+1])
                    i++;
                else{
                    flag=false;
                    break;
                }
            }
        }
        else if(a[i]<a[i+1]){
            while(i!=n-1){
                if(a[i]<a[i+1])
                    i++;
                    else{
                        flag=false;
                        break;
                    }
            }
        }
      
        if(flag==false)
            System.out.println("It is an unsorted array....");
        else if(a[0]>a[1])
            System.out.println("It is an decreasing array...");
        else
        System.out.println("It is an increasing array...");            
    }
}
