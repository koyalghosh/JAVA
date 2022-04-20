public class LeapYear {
    public static void main(String args[]){
        int y=2002;
        String result;
        if(y%400==0 || y%100!=0 && y%4==0)//if %400 i.e its a century too
            result="a Leap year";
        else
            result="Not a leap year";
        System.out.println(y + " is " + result);
    }
}
