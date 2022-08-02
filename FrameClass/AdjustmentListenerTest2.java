import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class AdjustmentListenerTest2 extends JFrame implements AdjustmentListener {
	JTextField t1;
	JScrollBar s1,s2,s3;
	
	AdjustmentListenerTest2(){
		setLayout(new GridLayout(4,1));
		t1=new JTextField(20);
		s1=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		s2=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		s3=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,256);
		t1.setEditable(false);
		add(t1);add(s1);add(s2);add(s3);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		setBounds(100,100,400,300);
		setVisible(true);
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
			t1.setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
			//getValue();will return value of scrollbar
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdjustmentListenerTest2();
	}

}
