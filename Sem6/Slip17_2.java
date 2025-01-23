import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Slip17_2 extends JFrame implements ActionListener {
    JButton b1;
    JTextField t1;
    Container c;

    Slip17_2() {
        setVisible(true);
        setSize(800, 800);
        c = getContentPane();
        setLayout(null);

        t1 = new JTextField();
        c.add(t1);
        t1.setBounds(10, 10, 1000, 30);
        b1 = new JButton("start");
        c.add(b1);
        b1.setBounds(20, 50, 100, 50);
        b1.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        	new Thread(new MyRunnable()).start();
        }
    }

    class MyRunnable implements Runnable{
    	public void run(){
    		for(int i=0;i<=100;i++){
    			try{
    				Thread.sleep(1000);
    			}catch(Exception e){}
    			t1.setText(t1.getText() + i + " ");
    		}
    	}
    }
    public static void main(String args[]) {
        new Slip17_2();
    }
}
