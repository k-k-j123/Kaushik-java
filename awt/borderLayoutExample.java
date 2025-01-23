import java.awt.*;
import javax.swing.*;
class borLay extends JFrame{
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JButton b1;
	borLay(){
		setLayout(new BorderLayout());
		l1=new JLabel("NORTH");
		add(l1,BorderLayout.NORTH);
		l2=new JLabel("SOUTH");
		add(l2,BorderLayout.SOUTH);
		l3=new JLabel("EAST");
		add(l3,BorderLayout.EAST);
		l4=new JLabel("WEST");
		add(l4,BorderLayout.WEST);
		b1=new JButton("Center");
		add(b1,BorderLayout.CENTER);

		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
}
class borderLayoutExample{
	public static void main(String args[]){
		new borLay();
	}
}

