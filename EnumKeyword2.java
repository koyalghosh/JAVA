/*

 */
import java.util.Scanner;
enum month{
    jan(31),feb(28),mar(31),apr(30);//parameterized constructor is called
    private int days;
    month(int days){
        this.days=days;
    }
    int days(){
        return days;
    }
}
public class EnumKeyword2 {
    public static void main(String args[]){
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter month(jan,feb,mar,apr):- ");
        month m1=month.valueOf(s1.next());//taking input from user 
        switch(m1){
            case jan:
                System.out.println(m1.days());
                break;
            case feb:
                System.out.println(m1.days());
                break;
            case mar:
                System.out.println(m1.days());
                break;
            case apr:
                System.out.println(m1.days());
                break;        
        }
    }
}
/*
OUTPUT:
Enter month(jan,feb,mar,apr):- jan
31
 */