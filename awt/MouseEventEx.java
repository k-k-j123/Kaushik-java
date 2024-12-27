import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class Mouse extends JFrame implements MouseInputListener{
	JLabel label;
	public Mouse(){
		setLayout(new FlowLayout());
		setSize(200,200);
		setTitle("Mouse listner");
		label=new JLabel("Move or click the mouse");
		add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(this);
		addMouseMotionListener(this);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e){
			label.setText(e.getX()+" "+e.getY());
	}
	public void mouseDragged(MouseEvent e){
			label.setText(e.getX()+" "+e.getY());
	}
	
	@Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}
}
class MouseEventEx{
	public static void main(String args[]){
		new Mouse();
	}
}


		

