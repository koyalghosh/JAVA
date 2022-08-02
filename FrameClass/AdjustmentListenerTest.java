//Adjustment Listener is used for scrollbar.


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class AdjustmentListenerTest extends JFrame implements AdjustmentListener {
	JTextField  t1;
	JScrollBar sb1;

	AdjustmentListenerTest(){
		t1=new JTextField(25);
		setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		sb1=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,101);
		//orientation,initial value,minimum,maximum
		sb1.addAdjustmentListener(this);
		sb1.setPreferredSize(new Dimension(200,35));//width,height of scrollbar
		sb1.setUnitIncrement(5);//press on scroll bar increment by 5
		sb1.setBlockIncrement(15);//press on empty space increment by 15
		add(t1);add(sb1);
		setBounds(200,200,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdjustmentListenerTest();

	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		// TODO Auto-generated method stub
		//JScrollBar s=(JScrollBar)e.getSource();
		t1.setText(Integer.toString(sb1.getValue()));
	}

}
