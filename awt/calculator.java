import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calc extends JFrame implements ActionListener {
    JButton b[];
    JTextField t;
    String input = "", operator = "";
    double num1 = 0, num2 = 0, result = 0;

    Calc() {
        b = new JButton[20];
        t = new JTextField();
        t.setEditable(false);
        JPanel p = new JPanel(new GridLayout(5, 4, 2, 2));
        b[0] = new JButton("AC");
        b[1] = new JButton("%");
        b[2] = new JButton("del");
        b[3] = new JButton("/");
        b[4] = new JButton("7");
        b[5] = new JButton("8");
        b[6] = new JButton("9");
        b[7] = new JButton("*");
        b[8] = new JButton("4");
        b[9] = new JButton("5");
        b[10] = new JButton("6");
        b[11] = new JButton("-");
        b[12] = new JButton("1");
        b[13] = new JButton("2");
        b[14] = new JButton("3");
        b[15] = new JButton("+");
        b[16] = new JButton("00");
        b[17] = new JButton("0");
        b[18] = new JButton(".");
        b[19] = new JButton("=");

        for (int i = 0; i <= 19; i++) {
            p.add(b[i]);
            b[i].addActionListener(this);
        }

        setLayout(new BorderLayout());
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        add(t, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            input += command;
            t.setText(input);
        } else if (command.equals("AC")) {
            input = "";
            operator = "";
            num1 = num2 = result = 0;
            t.setText("");
        } else if (command.equals("del")) {
            if (input.length() > 0) {
                input = input.substring(0, input.length() - 1);
                t.setText(input);
            }
        } else if (command.equals("%")) {
            if (!input.isEmpty()) {
                double value = Double.parseDouble(input);
                value = value / 100;
                t.setText(String.valueOf(value));
                input = String.valueOf(value);
            }
        } else if (command.equals("=")) {
            if (!input.isEmpty()) {
                num2 = Double.parseDouble(input);
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                t.setText(String.valueOf(result));
                input = String.valueOf(result);
                operator = "";
            }
        } else {
            if (!input.isEmpty()) {
                num1 = Double.parseDouble(input);
                operator = command;
                input = "";
            }
        }
    }
}

class calculator {
    public static void main(String args[]) {
        new Calc();
    }
}

