package FramePrograms;
import java.awt.*;

public class Program1 extends Frame {
    TextArea ta1;
    Button b1,b2,b3,b4,b5;
    Scrollbar sb1,sb2;
    Panel p1,p2;
    GridLayout gl;
    Font f1;
    Program1(){
        setTitle("Program");
        ta1=new TextArea();//creating TextArea
        add(ta1);
        f1=new Font("arial",Font.BOLD,12);
        b1=new Button("OK");
        b2=new Button("Cancel");
        b3=new Button("B");
        b4=new Button("I");
        b5=new Button("U");
        b1.setFont(f1);
        b2.setFont(f1);//adding font
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        p1=new Panel();
        p2=new Panel();
        p1.add(b1);//add to panel p1
        p1.add(b2);//add to panel p1
        p2.add(b3);//add to panel p2
        p2.add(b4);//add to panel p2
        p2.add(b5);//add to panel p2
        add(p1,BorderLayout.NORTH);//add panel p1 to NORTH
        add(p2,BorderLayout.WEST);//add panel p2 to WEST
        gl=new GridLayout(3,1);//adding p2 in grid format
        p2.setLayout(gl);//setting layout of panel p2 as grid
        sb1=new Scrollbar(Scrollbar.VERTICAL);//creating scrollbar(Vertical)
        sb2=new Scrollbar(Scrollbar.HORIZONTAL);//creating scrollbar(Horizontal)
        
        add(sb1,BorderLayout.EAST);//adding scrollbar to EAST
        add(sb2,BorderLayout.SOUTH);//adding scrollbar to SOUTH
        setBounds(100,100,400,300);//x,y,width,height
        setBackground(Color.GRAY);//background color
        setForeground(Color.RED);//text color
        setVisible(true);//visibility of frame
        try{
          Thread.sleep(5000);//5 seconds
        }
        catch(InterruptedException e){
          e.printStackTrace();
        }
        dispose();//to dispose frame after 5 seconds
    }
    public static void main(String args[]){
        new Program1();
    }   
}
