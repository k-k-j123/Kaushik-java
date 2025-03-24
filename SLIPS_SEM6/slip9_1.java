import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class slip9_1 extends JFrame {
    int y=0;
    boolean moving=false;

    public slip9_1(){
        setTitle("Moving Ball");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        final BallPanel ballPanel = new BallPanel();
        JButton starButton=new JButton("start");
        starButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ballthread ballthread = new Ballthread(ballPanel);
                ballthread.start();
            }
        });
        add(ballPanel,BorderLayout.CENTER);
        add(starButton,BorderLayout.SOUTH);
        setVisible(true);
    }

    class BallPanel extends JPanel{

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(100,y,30,30);
        }
    }
    class Ballthread extends Thread{
        public BallPanel panel;
        public Ballthread(BallPanel panel){
            this.panel=panel;
        }
        @Override
        public void run(){
            moving=true;
            while(moving){
                y+=5;
                if(y>panel.getHeight()){
                    y=0;
                }
                panel.repaint();
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    return;
                }
            }
        }
    }
    public static void main(String args[]){
        new slip9_1();
    }

}
