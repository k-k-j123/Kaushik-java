import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Str extends JFrame implements ActionListener{
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JLabel l1;
	JLabel l2;
	JButton b1;
	JButton b2;
	Str(){
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		l1=new JLabel("String 1");
		l2=new JLabel("String 2");
		b1=new JButton("concat");
		b2=new JButton("reverse");

		b1.addActionListener(this);
		b2.addActionListener(this);

		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);add(b2);
		add(t3);
		
		setLayout(new GridLayout(4,2,2,2));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,150);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			t3.setText(t1.getText()+t2.getText());
		}
		if(e.getSource()==b2){
			String s=t1.getText();
			StringBuffer s1=new StringBuffer(s);
			t3.setText(s1.reverse().toString());
		}
	}
}
class awtString{
	public static void main(String args[]){
		new Str();
	}
}
