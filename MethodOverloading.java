/*Method Overloading:-  It is same as function overloading in C++.
    A method can be overloaded if:
        (i)     Function name must be same.
        (ii)    or Function have different argument data type.
        (iii)   or Function have different number of arguments.
        (iv)    or Order of function arguments are different.
        (v)     Only difference in return type is not considered.
        */
public class MethodOverloading {
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(5,6));
        System.out.println(sum(5,6,7));
    }
}
