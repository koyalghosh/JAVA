/* assert KEYWORD
It is a keyword added in jdk1.4 . It is used normally at development time(i.e development of software/program) not
at run time. It is used to check for ceratin condition in a method. We can enable or disable aseertion but
by default assertion is disable , to enable we ised -ea switch that means enable assertion.
When we run the program:
java AssertKeyword //assert is disable
java -ea AssertKeyword //assert is enabled 
*/
class AssertKeyword {
    static int n=5;
    static int func(){
        return --n;
    }
    public static void main(String aegs[]){
        for(int i=0;i<10;i++){
            int ans=func();
            assert(ans>0):"0 or negative number";//it is something like ternary operator condition?true:false
            System.out.println(ans);
        }
    }
}
/*
OUTPUT:
PS C:\Users\USER\.vscode\Java> java AssertKeyword
4
3 
2 
1 
0 
-1
-2
-3
-4
-5
PS C:\Users\USER\.vscode\Java> java -ea AssertKeyword 
4
3
2
1
Exception in thread "main" java.lang.AssertionError: 0 or negative number
        at AssertKeyword.main(AssertKeyword.java:17)
 */