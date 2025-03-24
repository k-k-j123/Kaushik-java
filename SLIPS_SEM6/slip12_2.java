import javax.swing.*;
import java.sql.*;

public class slip12_2 extends JFrame {
    public slip12_2() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM project");
            ResultSetMetaData rsm = rs.getMetaData();
            rsm.getColumnCount();

            Object[][] data = new Object[10][4]; // Assuming max 10 rows
            String[] columns = {"Project Id", "Project Name", "Project Description", "Project Status"};

            int i = 0;
            while (rs.next()) {
                data[i][0] = rs.getInt(1);
                data[i][1] = rs.getString(2);
                data[i][2] = rs.getString(3);
                data[i][3] = rs.getString(4);
                i++;
            }

            JTable table = new JTable(data, columns);
            this.add(new JScrollPane(table));
        } catch (Exception e) {
            System.out.println(e);
        }

        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new slip12_2();
    }
}