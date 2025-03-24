import java.sql.*;
import java.util.Scanner;

public class slip16_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/testdb", "postgres", "123");

            System.out.println("Enter how many records you want to insert:");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the Teacher " + (i + 1) + " details:");

                System.out.println("Enter Teacher ID:");
                int id = scanner.nextInt();

                System.out.println("Enter Teacher Name:");
                String name = scanner.next();

                System.out.println("Enter Teacher Subject:");
                String subject = scanner.next();

                PreparedStatement ps = connection.prepareStatement("INSERT INTO teacher VALUES (?, ?, ?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, subject);
                ps.executeUpdate();
            }

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM teacher WHERE subject = 'JAVA'");

            System.out.println("Teacher Number\tTeacher Name\tSubject");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}