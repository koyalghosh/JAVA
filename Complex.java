//This program contains to classes 1st one is Complex.java and 2nd one is TestComplex.java

//CLASS  Complex.java
import java.util.Scanner;
public class Complex {
    private int real,imag;
    Complex(){
        real=imag=0;
    }
    Complex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real part:- ");
        real=sc.nextInt();
        System.out.print("Enter imaginary part:- ");
        imag=sc.nextInt();
    }
    void display(){
        if(imag>=0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " " + imag + "i");
        }
    Complex sum(Complex c2){
        /*Complex c3;
        c3=new Complex();
        c3.real=this.real+c2.real;
        c3.imag=this.imag+c2.imag;
        return c3;
                OR
        Complex c3=new Complex(this.real+c2.real,this.imag+c2.imag);
        return c3;
                OR*/
        return new Complex(this.real+c2.real,this.imag+c2.imag);
    }

    Complex multiply(Complex c2){
        Complex c3;
        c3=new Complex();
        c3.real=(this.real * c2.real) - (this.imag * c2.imag);
        c3.imag=(this.real * c2.imag) + (this.imag * c2.real);
        return c3;
    }
}



//CLASS TestComplex.java


class TestComplex{
    public static void main(String args []){
        Complex c1,c2,c3,c4;
        c1=new Complex();
        c2=new Complex();
        System.out.println("Enter values for 1st complex number: ");
        c1.getData();
        System.out.println("Enter values for 2nd complex number: ");
        c2.getData();
        c3=c1.sum(c2);
        System.out.println("Sum of the program is:");
        c3.display();
        System.out.println("Multiply of complex number is: ");
        c4=c1.multiply(c2);
        c4.display();
    }
}
