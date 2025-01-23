import java.awt.*;
import javax.swing.*;
class Menu extends JFrame{
	JMenuBar mb;
	Menu(){
		mb=new JMenuBar();
		JMenuItem n=new JMenuItem("New");
		JMenuItem o=new JMenuItem("Open");
		JMenuItem s=new JMenuItem("Save");
		JMenuItem sh=new JMenuItem("Show About");
		JMenuItem e=new JMenuItem("exit");

		JMenu file=new JMenu("file");
		JMenu Edit=new JMenu("Edit");
		JMenu About=new JMenu("About");

		file.add(n);file.add(o);file.add(s);file.addSeparator();file.add(sh);file.addSeparator();file.add(e);

		mb.add(file);
		mb.add(Edit);
		mb.add(About);
		
		setLayout(new FlowLayout());
		setJMenuBar(mb);
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class awtMenu{
	public static void main(String args[]){
		new Menu();
	}
}
