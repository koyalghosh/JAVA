import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class FocusListenerTest extends JFrame implements FocusListener {
	JTextField t1,t2,t3;
	FocusListenerTest(){
		setLayout(new GridLayout(3,1));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t1.setBackground(Color.YELLOW);
		t2.setBackground(Color.YELLOW);
		t3.setBackground(Color.YELLOW);
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		t3.addFocusListener(this);
		add(t1);add(t2);add(t3);
		setBounds(400,400,400,400);//x,y,width,height
		setVisible(true);
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		JTextField t=(JTextField)e.getSource();
		t.setBackground(Color.GREEN);
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		JTextField t=(JTextField)e.getSource();
		t.setBackground(Color.YELLOW);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FocusListenerTest();

	}

}
