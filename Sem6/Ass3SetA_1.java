import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class ProjectTable {

    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:postgresql://localhost:5432/your_database";
        String username = "your_username";
        String password = "your_password";

        // Connect to the database
        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            // Create a project table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS project ("
                    + "project_id SERIAL PRIMARY KEY, "
                    + "project_name VARCHAR(255), "
                    + "project_desc TEXT, "
                    + "project_status VARCHAR(50))";
            try (Statement stmt = connection.createStatement()) {
                stmt.execute(createTableSQL);
            }

            // Insert values into the project table
            String insertSQL = "INSERT INTO project (project_name, project_desc, project_status) VALUES "
                    + "('Project A', 'Description A', 'Active'), "
                    + "('Project B', 'Description B', 'Completed'), "
                    + "('Project C', 'Description C', 'In Progress')";
            try (Statement stmt = connection.createStatement()) {
                stmt.execute(insertSQL);
            }

            // Retrieve data from the project table
            String selectSQL = "SELECT * FROM project";
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSQL)) {

                // Create Swing components to display data
                JFrame frame = new JFrame("Project Details");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 400);

                String[] columnNames = {"Project ID", "Project Name", "Project Description", "Project Status"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                frame.add(scrollPane, BorderLayout.CENTER);

                while (rs.next()) {
                    int projectId = rs.getInt("project_id");
                    String projectName = rs.getString("project_name");
                    String projectDesc = rs.getString("project_desc");
                    String projectStatus = rs.getString("project_status");
                    model.addRow(new Object[]{projectId, projectName, projectDesc, projectStatus});
                }

                frame.setVisible(true);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
