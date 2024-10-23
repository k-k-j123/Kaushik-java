import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CurrencyConvertor extends JFrame {
    private JTextField sgdField;
    private JTextField usdField;
    private JTextField euroField;

    private static final double USD_TO_SGD = 1.41;
    private static final double USD_TO_EURO = 0.92;
    private static final double SGD_TO_EURO = 0.65;

    public CurrencyConvertor() {
        sgdField = new JTextField(10);
        usdField = new JTextField(10);
        euroField = new JTextField(10);

        sgdField.addKeyListener(new KeyListener());
        usdField.addKeyListener(new KeyListener());
        euroField.addKeyListener(new KeyListener());

        setLayout(new GridLayout(3, 2));
        add(new JLabel("SGD:"));
        add(sgdField);
        add(new JLabel("USD:"));
        add(usdField);
        add(new JLabel("EUR:"));
        add(euroField);

        setTitle("Currency Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void convert() {
        try {
            if (!sgdField.getText().isEmpty()) {
                double sgd = Double.parseDouble(sgdField.getText());
                usdField.setText(String.format("%.2f", sgd / USD_TO_SGD));
                euroField.setText(String.format("%.2f", sgd * SGD_TO_EURO));
            } else if (!usdField.getText().isEmpty()) {
                double usd = Double.parseDouble(usdField.getText());
                sgdField.setText(String.format("%.2f", usd * USD_TO_SGD));
                euroField.setText(String.format("%.2f", usd * USD_TO_EURO));
            } else if (!euroField.getText().isEmpty()) {
                double euro = Double.parseDouble(euroField.getText());
                sgdField.setText(String.format("%.2f", euro / SGD_TO_EURO));
                usdField.setText(String.format("%.2f", euro / USD_TO_EURO));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private class KeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                convert();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CurrencyConvertor::new);
    }
}

