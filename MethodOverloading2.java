//As there are multiple functions in method overloading so to do the same work 
//using 1 function only we can use the below code
public class MethodOverloading2 {
    static int sum(int a[]){
        int s=0;
        for(int x:a)
            s+=x;
        return s;
    }
    public static void main(String args[]){
        int a[]={10,20};
        System.out.println(sum(a));
        int b[]={10,20,30};
        System.out.println(sum(b));
    }
}
