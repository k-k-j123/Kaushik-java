import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ComBox extends JFrame implements ActionListener{
	String Subjects[]={"CS","TCS","OS","WT"};
	JComboBox<String> cb;
	JTextField t1;
	ComBox(){
		cb=new JComboBox<>(Subjects);
		t1=new JTextField();

		cb.addActionListener(this);
		add(cb);
		add(t1);
		setLayout(new GridLayout(2,1,2,2));
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		String s=(String) cb.getSelectedItem();
		t1.setText(s);
	}
}
class ComboBoxExample{
	public static void main(String args[]){
		new ComBox();
	}
}

