//Variable sized array:- Whose size is not fixed.It take zero or more argument
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
