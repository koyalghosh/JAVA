import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class LoginPageTest extends JFrame{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton login,close;
	JCheckBox cb;
	
	LoginPageTest(){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(4,2));
		l1=new JLabel("User ID");
		l2=new JLabel("Password");
		t1=new JTextField();
		p1=new JPasswordField();
		p1.setEchoChar('*');
		login=new JButton("LOGIN");
		close=new JButton("CLOSE");
		cb=new JCheckBox("Show Password");
		login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent  e) {
				String s=t1.getText();
				String p=new String(p1.getPassword());//returns character array
				
				if(s.equals("koyal") && p.equals("koyal123"))
					JOptionPane.showMessageDialog(LoginPageTest.this,"WELCOME "+s);
				else
					JOptionPane.showMessageDialog(LoginPageTest.this,"Invalid username or password !");
			}
		});
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent  e) {
				dispose();
			}
		});
		cb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				boolean state=cb.isSelected();
				if(state==true)
					p1.setEchoChar((char)0);
				else
					p1.setEchoChar('*');
			}
		});
		add(l1);add(t1);
		add(l2);add(p1);
		add(login);add(close);
		add(cb);
		setBounds(200,200,400,400);;//x,y,width,height
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginPageTest();
	}

}
