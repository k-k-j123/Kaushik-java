import java.awt.*;
import java.awt.event.*;

public class ConcentricCircles extends Frame implements MouseListener {
    private int x, y;

    public ConcentricCircles() {
        setSize(400, 400);
        setTitle("Concentric Circles");
        setVisible(true);
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        if (x != 0 && y != 0) {
            int[] radii = {20, 40, 60};
            for (int radius : radii) {
                g.setColor(Color.GRAY);
                g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
            }
        }
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        ConcentricCircles circles = new ConcentricCircles();
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                break;
            }
        }
        circles.dispose();
    }
}
