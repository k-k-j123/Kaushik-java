import javax.swing.*;
import java.sql.*;

public class slip27_1 extends JFrame {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/testdb";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "123";
    
    public slip27_1() {
        initializeFrame();
        loadAndDisplayData();
    }
    
    private void initializeFrame() {
        setTitle("College Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
    }
    
    private void loadAndDisplayData() {
        try (Connection con = getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM college")) {
            
            // Define column names
            String[] columns = {
                "College Id",
                "College Name",
                "College Address",
                "Establishment Year"
            };
            
            // Get row count
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();
            
            // Create data array with correct dimensions
            Object[][] data = new Object[rowCount][columns.length];
            
            // Populate data array
            int row = 0;
            while (rs.next()) {
                data[row][0] = rs.getInt(1);
                data[row][1] = rs.getString(2);
                data[row][2] = rs.getString(3);
                data[row][3] = rs.getInt(4);
                row++;
            }
            
            // Create and configure table
            JTable table = new JTable(data, columns);
            table.setFillsViewportHeight(true);
            
            // Add table to scroll pane
            JScrollPane scrollPane = new JScrollPane(table);
            add(scrollPane);
            
            // Make frame visible
            setVisible(true);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,
                "Database error: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "An error occurred: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("PostgreSQL JDBC Driver not found", e);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new slip27_1());
    }
}