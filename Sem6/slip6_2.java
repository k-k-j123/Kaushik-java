import javax.swing.*;
import java.awt.*;
public class slip6_2 extends JFrame implements Runnable{
    Thread t=null;
    int time;
    int cnt;
    public slip6_2(){
        setTitle("Signal Timer");
        setSize(200,250);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        time=10;
        cnt=0;
        t=new Thread(this);
        t.start();
    }

    public void run(){
        try{
            while(true){
                while(time>=0){
                    repaint();
                    Thread.sleep(500);
                    time--;
                }
                cnt=(cnt+1)%3;
                time=10;
                if(cnt==1)
                    time=5;
            }   
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.black);
        g.drawOval(70,50,50, 50);
        g.drawOval(70,110,50,50);
        g.drawOval(70,170,50,50);

        String msg="time:"+time;
        g.drawString(msg,80, 230);

        if(cnt==0){
            g.setColor(Color.green);
            g.fillOval(70,170,50,50);
        }else if(cnt==1){
            g.setColor(Color.orange);
            g.fillOval(70,110,50,50);
        }else{
            g.setColor(Color.red);
            g.fillOval(70,50,50,50);
        }
    }

    public static void main(String args[]){
        new slip6_2();
    }
}
