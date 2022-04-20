import java.util.Scanner;
class RollName {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll number:- ");
        int roll=sc.nextInt();
        //sc.skip("\r\n");//it will skip the enter of previous input
        //or
        sc.nextLine();//it will read extra enter i.e previous input enter
        System.out.print("Enter your name:- ");
        String name=sc.nextLine();//this func will read space too
        System.out.println("Roll number is " + roll + "\nName is " +name);
    }
}
