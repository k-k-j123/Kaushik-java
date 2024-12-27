import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame {
    private JLabel lblC, lblF;
    private JTextField txtC, txtF;
    private JButton btnConvert;

    public TempConverter() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));

        lblC = new JLabel("Celsius:");
        lblF = new JLabel("Fahrenheit:");
        txtC = new JTextField(10);
        txtF = new JTextField(10);
        
        btnConvert = new JButton("Convert");
        btnConvert.addActionListener(e -> {
            try {
                if (!txtC.getText().isEmpty()) {
                    double celsius = Double.parseDouble(txtC.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    txtF.setText(String.format("%.1f", fahrenheit));
                } else if (!txtF.getText().isEmpty()) {
                    double fahrenheit = Double.parseDouble(txtF.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    txtC.setText(String.format("%.1f", celsius));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(lblC);
        add(txtC);
        add(lblF);
        add(txtF);
        add(new JPanel() {{
            add(btnConvert);
        }});

        setVisible(true);
    }

    public static void main(String[] args) {
        new TempConverter();
    }
}

