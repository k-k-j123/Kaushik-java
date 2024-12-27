import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInputForm extends JFrame {
    private JLabel nameLabel, classLabel, hobbiesLabel, resultLabel;
    private JTextField nameField;
    private JRadioButton fyButton, syButton, tyButton;
    private JCheckBox musicCheckBox, danceCheckBox, sportsCheckBox;
    private JTextArea resultTextArea;

    public UserInputForm() {
        setTitle("User Input Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(4, 2));

        nameLabel = new JLabel("Your Name");
        nameField = new JTextField(20);
        classLabel = new JLabel("Your Class");
        hobbiesLabel = new JLabel("Your Hobbies");

        fyButton = new JRadioButton("FY");
        syButton = new JRadioButton("SY");
        tyButton = new JRadioButton("TY");
        ButtonGroup classGroup = new ButtonGroup();
        classGroup.add(fyButton);
        classGroup.add(syButton);
        classGroup.add(tyButton);

        musicCheckBox = new JCheckBox("Music");
        danceCheckBox = new JCheckBox("Dance");
        sportsCheckBox = new JCheckBox("Sports");

        resultLabel = new JLabel("Result:");
        resultTextArea = new JTextArea(5, 20);
        resultTextArea.setEditable(false);

        add(nameLabel);
        add(nameField);
        add(classLabel);
        add(new JPanel(new GridLayout(3, 1)) {{
            add(fyButton);
            add(syButton);
            add(tyButton);
        }});
        add(hobbiesLabel);
        add(new JPanel(new GridLayout(3, 1)) {{
            add(musicCheckBox);
            add(danceCheckBox);
            add(sportsCheckBox);
        }});
        add(resultLabel);
        add(resultTextArea);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String classSelected = "";
                if (fyButton.isSelected()) {
                    classSelected = "FY";
                } else if (syButton.isSelected()) {
                    classSelected = "SY";
                } else if (tyButton.isSelected()) {
                    classSelected = "TY";
                }
                String hobbiesSelected = "";
                if (musicCheckBox.isSelected()) {
                    hobbiesSelected += "Music, ";
                }
                if (danceCheckBox.isSelected()) {
                    hobbiesSelected += "Dance, ";
                }
                if (sportsCheckBox.isSelected()) {
                    hobbiesSelected += "Sports, ";
                }
                hobbiesSelected = hobbiesSelected.substring(0, hobbiesSelected.length() - 2);
                resultTextArea.setText("Name: " + name + "\nClass: " + classSelected + "\nHobbies: " + hobbiesSelected);
            }
        });

        add(new JPanel() {{
            setLayout(new FlowLayout(FlowLayout.RIGHT));
            add(submitButton);
        }});

        setVisible(true);
    }

    public static void main(String[] args) {
        new UserInputForm();
    }
}
