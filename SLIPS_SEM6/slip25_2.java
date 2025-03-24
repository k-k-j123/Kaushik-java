import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class slip25_2 extends JFrame implements ActionListener {
    JLabel l1;
    JButton create, alter, drop;
    JTextField t1;
    PreparedStatement ps;
    Connection con;
    ResultSet rs;

    public slip25_2() {
        l1 = new JLabel("Type your DDL query here:");
        create = new JButton("Create Table");
        alter = new JButton("Alter Table");
        drop = new JButton("Drop Table");
        t1 = new JTextField(30);
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(create);
        add(alter);
        add(drop);
        create.addActionListener(this);
        alter.addActionListener(this);
        drop.addActionListener(this);
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "123");
        } catch (Exception e) {
            System.out.println(e);
        }
        this.setTitle("DDL Queries");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(340, 350);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String qr = t1.getText();
        try {
            Statement st = con.createStatement();
            if (ae.getSource() == create) {
                st.execute(qr);
                System.out.println("Table Created Successfully");
            }
            if (ae.getSource() == alter) {
                st.execute(qr);
                System.out.println("Table Altered Successfully");
            }
            if (ae.getSource() == drop) {
                st.execute(qr);
                System.out.println("Table Dropped Successfully");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new slip25_2();
    }
}