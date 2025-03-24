import java.sql.*;
import java.util.Scanner;

public class slip22_1 {
    public static void main(String[] args) {
        Connection con;
        ResultSet rs;
        Statement stmt;
        PreparedStatement ps;
        Scanner scanner = new Scanner(System.in);

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish a connection to the database
            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/testdb", "postgres", "123");

            while (true) {
                System.out.println("\n1. Insert\n2. Update\n3. Display\n4. Exit");
                System.out.println("Enter your choice:");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: // Insert
                        System.out.println("Enter Employee Number:");
                        int empId = scanner.nextInt();

                        System.out.println("Enter Employee Name:");
                        String empName = scanner.next();

                        System.out.println("Enter Salary:");
                        int salary = scanner.nextInt();

                        ps = con.prepareStatement("INSERT INTO emp VALUES (?, ?, ?)");
                        ps.setInt(1, empId);
                        ps.setString(2, empName);
                        ps.setInt(3, salary);
                        ps.executeUpdate();
                        break;

                    case 2: // Update
                        System.out.println("Enter the Employee Number to update:");
                        int empIdToUpdate = scanner.nextInt();

                        System.out.println("Enter Employee Name:");
                        String newEmpName = scanner.next();

                        System.out.println("Enter Salary:");
                        int newSalary = scanner.nextInt();

                        ps = con.prepareStatement("UPDATE emp SET ename = ?, salary = ? WHERE empid = ?");
                        ps.setString(1, newEmpName);
                        ps.setInt(2, newSalary);
                        ps.setInt(3, empIdToUpdate);
                        ps.executeUpdate();
                        break;

                    case 3: // Display
                        stmt = con.createStatement();
                        rs = stmt.executeQuery("SELECT * FROM emp");

                        System.out.println("Employee Number\tEmployee Name\tSalary");
                        while (rs.next()) {
                            System.out.println(
                                rs.getInt(1) + "\t" +
                                rs.getString(2) + "\t" +
                                rs.getInt(3));
                        }
                        break;

                    case 4: // Exit
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}