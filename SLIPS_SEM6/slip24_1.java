import javax.swing.*;
import java.awt.*;

public class slip24_1 extends JPanel implements Runnable {
    // Constants
    private static final int SCROLL_SPEED = 5;
    private static final int SLEEP_TIME = 100;
    
    // Instance variables
    private String text = " Welcome to Java ";
    private int x = 0;

    public slip24_1() {
        new Thread(this).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(text, x, 50);
    }

    @Override
    public void run() {
        while (true) {
            x += SCROLL_SPEED;
            if (x > getWidth()) {
                x = -text.length() * 10;
            }
            repaint();
            
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scrolling Text");
        slip24_1 obj = new slip24_1();
        frame.add(obj);
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}