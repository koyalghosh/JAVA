/*enum keyword and Enum class
1.enum is a keyword added in jdk1.5
2.enumeration is a list of named constants these constants are called as selftyped constants(i.e constants
have the same type as enum have) and these are actually objects.
3.objects(constants) are public,static and final members of the enum.
4.enumeration are of class type but we can't instantiate using new keyword we can just declare their variables
just like primitives and these variables can store only those values which are defined inside.
5.Every num automatically inherits a class java.lang.Enum and we can implement any interface in our 
enumeration.
 
*/

//No use of ; at end because java class syntax doesn't ends with ;
enum days{sun,mon,tue,wed,thu,fri,sat}
public class EnumKeyword {
    public static void main(String args[]){
        days d1=days.mon;
        days d2=days.valueOf("tue");//or days d2=days.tue;
        System.out.println(d1);//toString() called by Enum class (mon)
        System.out.println(d1.ordinal());//print index of "mon" in enum i.e 1

        //if d1>d2 then +1 , if d1<d2 then -1 
        System.out.println(d1.compareTo(d2));//comapares index
        for(days d : days.values())//values() returns all the values in enum
            System.out.println(d);
        switch(d2){
            case sun://days.sun not writtedn because it is known that sun is of type days as in switch case we passed days refrence
                System.out.println("First");
                break;
            case mon:
                System.out.println("Second");
                break;
            case tue:
                System.out.println("Third");
                break;
        }
    }
}
/*
OUTPUT:
mon
1  
-1 
sun
mon
tue
wed
thu
fri
sat
Third
 */
Footer
