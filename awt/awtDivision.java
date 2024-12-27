import javax.swing.*;
import java.awt.*;
 class IntegerDiv extends JFrame {
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btnDivide;

    public IntegerDiv() {
        setTitle("Integer Division");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(4, 2));

        txtNum1 = new JTextField(10);
        txtNum2 = new JTextField(10);
        txtResult = new JTextField(10);
        txtResult.setEditable(false); 
        btnDivide = new JButton("Divide");

        btnDivide.addActionListener(e -> performDivision());

        add(new JLabel("Number 1:"));
        add(txtNum1);
        add(new JLabel("Number 2:"));
        add(txtNum2);
        add(new JLabel("Result:"));
        add(txtResult);
        add(new JPanel() {{
            add(btnDivide);
        }});

        setVisible(true);
    }

    private void performDivision() {
        try {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int result = num1 / num2;
            txtResult.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
class awtDivision{
	public static void main(String args[]){
		new IntegerDiv();
	}
}
