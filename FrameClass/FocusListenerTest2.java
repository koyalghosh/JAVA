import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class FocusListenerTest2 extends JFrame implements FocusListener {
	JTextField t1,t2;
	String s1;
	FocusListenerTest2(){
		t1=new JTextField(20);//maximum letters in TextField
		t2=new JTextField(20);
		setLayout(new FlowLayout(FlowLayout.CENTER,20,40));
		add(t1);add(t2);
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		setBounds(400,400,500,600);//x,y,width,height
		setVisible(true);
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		JTextField t=(JTextField)e.getSource();
		t.setText(s1);
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		JTextField t=(JTextField)e.getSource();
		s1=t.getText();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FocusListenerTest2();
	}

}
