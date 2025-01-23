import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;
class Slip20_2 extends JFrame implements Runnable{
	private JLabel L1;
	private boolean isVisible=false;
	public Slip20_2(){
		setLayout(new FlowLayout());
		ImageIcon ic=new ImageIcon("./image.jpg");
		L1=new JLabel(ic);
		add(L1);
		setTitle("Blink Image");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run(){
		try{
			while(true){
				if(isVisible){
					L1.setVisible(false);
				}
				else{
					L1.setVisible(true);
				}
				isVisible=!isVisible;
				Thread.sleep(500);
			}
		}catch(Exception e){
			System.out.println("Exception:"+e);
		}
	}

	public static void main(String args[]){
		new Slip20_2();
	}
}