import javax.swing.*;

public class slip4_1 extends JFrame implements Runnable {
    private JLabel label;

    public slip4_1() {
        label = new JLabel("This is Multithreading", SwingConstants.CENTER);
        add(label);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            label.setText("This is Multithreading");
            Thread.sleep(200);
            label.setText("");
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new slip4_1();
    }
}
