//Icon is parent class of ImageIcone class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageIconTest extends JFrame {
	JLabel l1;
	ImageIcon ii;
	
	ImageIconTest(){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		ii=new ImageIcon("D:\\java\\FramePrograms\\rabbit.jpg");//constructor-> ImageIcone(String);
		//getImage(); Coverts ImageIcon to Image type
		//getScaledInstance(width,height,quality);//sets size of image
		ii=new ImageIcon(ii.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		l1=new JLabel(ii);
		add(l1);
		setBounds(100,100,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageIconTest();
	}

	

}
