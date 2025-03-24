import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class slip1_2_jdbc extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton btnadd;
    Connection con;

    slip1_2_jdbc() {
        // Initialize GUI components
        l1 = new JLabel("Employee no:");
        l2 = new JLabel("Employee name:");
        l3 = new JLabel("Employee Description:");
        l4 = new JLabel("Employee Salary:");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        btnadd = new JButton("Add");
        
        // Set Layout and add components
        setLayout(new FlowLayout());
        setTitle("Employee Registration");
        setSize(350, 250);
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(4, 2, 20, 20));
        p1.add(l1); p1.add(t1);
        p1.add(l2); p1.add(t2);
        p1.add(l3); p1.add(t3);
        p1.add(l4); p1.add(t4);
        add(p1); add(btnadd);
        
        // Add action listener
        btnadd.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize database connection
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "123");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        int no = Integer.parseInt(t1.getText());
        String name = t2.getText();
        String desg = t3.getText();
        int sal = Integer.parseInt(t4.getText());
        
        try {
            PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
            ps.setInt(1, no);
            ps.setString(2, name);
            ps.setString(3, desg);
            ps.setInt(4, sal);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new slip1_2_jdbc();
    }
}
