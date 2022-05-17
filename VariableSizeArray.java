/*
VARIABLE SIZE ARRAY 
Whose size is not fixed.It take zero or more argument.


Rule of variable size array:

Rule 1 -->  void f1(int a,float b,int ... x);//a and b are compulsory and x can take zero or more arguments

Rule 2 --> void f1(int .. x,int y);//error
           void f1(int a,int ... b);//allowed
           
Rule 3 --> void f1(int ... x,float ... y);//not possible more than one var size array

Rule 4 --> int sum(int a,int b);//will take exactly two arguments
           int sum(int ... x);//can take zero or more arguments
           sum(6,7);//exact match will be called
           sum(5,6,7)//will call  var size array argument function
           
Rule 5 --> int f1(int ... x);
           float f1(float ... y);
           f1(5,6);//will call int return type function
           f1(5.6f,6.7f);//will call float return type function
           f1();//will call whose type is small in this int < float
           
           
*/
public class VariableSizeArray {
    //static int sum(int ... ar){//covert argument of line 10 into array. Problem with this array that it will take
        static int sum(int x,int ... ar){//zero argument but for sum we atleast need 2 arguments so to limit it we use this
        int s=x;//now in the above line 2 arguments is compulsory
        for(int e:ar)
            s+=e;
        return s;
    }
    public static void main(String args[]){
        System.out.println(sum(6,9,9,9));
    }
}
