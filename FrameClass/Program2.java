package FramePrograms;

import java.awt.*;
import java.awt.event.*;

public class Program2 extends Frame implements ActionListener{
    Button b1,b2;
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Font f1,f2,f3;

    Program2(){
        setTitle("AVG/SUM");
        GridLayout grid=new GridLayout(4,2);
        f1=new Font("arial",Font.BOLD,20);
        f2=new Font("arial",Font.BOLD,15);
        f3=new Font("arial",Font.ITALIC,13);

        l1=new Label("1st Number: ");
        l2=new Label("2nd Number: ");
        l3=new Label("Result: ");

        t1=new TextField();
        t2=new TextField();
        t3=new TextField();

        b1=new Button("SUM");
        b2=new Button("AVG");
    
        l1.setFont(f1);
        l3.setFont(f1);
        l2.setFont(f1);
        b1.setFont(f2);
        b2.setFont(f2);
        t1.setFont(f3);
        t2.setFont(f3);

        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b1);add(b2);

        b1.addActionListener(this);//argument must be a object of class which implements ActionListener interface
        b2.addActionListener(this);//it will automatically call actionPerfomed(ActionEvent ); method

        setLayout(grid);
        setBounds(100,100,400,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        //getting the source/button which is beign clicked
        Button b=(Button)ae.getSource();//getSource();returns Object type object but we are receiving it in Button type object so typecast is needed
        float ans=0.0f;
        ans=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
        if(b==b1)//comparing reference
            t3.setText(Float.toString(ans));
        else{
            ans/=2.0f;
            t3.setText(Float.toString(ans));
        }
        t3.setFont(f3);
    }
    public static void main(String args[]){
        new Program2();
    }
}
