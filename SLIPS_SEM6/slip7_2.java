import java.sql.*;
import java.util.Scanner;

public class slip7_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/testdb", "postgres", "123");

            System.out.println("Enter how many records you want to insert:");
            int n = s.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the product " + (i + 1) + " details:");

                System.out.println("Enter Product ID:");
                int id = s.nextInt();

                System.out.println("Enter Product Name:");
                String name = s.next();

                System.out.println("Enter Product Price:");
                int price = s.nextInt();

                PreparedStatement p = c.prepareStatement("INSERT INTO product VALUES (?, ?, ?)");
                p.setInt(1, id);
                p.setString(2, name);
                p.setInt(3, price);
                p.executeUpdate();
            }

            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM product");

            System.out.println("Product Number\tProduct Name\tProduct Price");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3));
            }

            rs.close();
            st.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            s.close();
        }
    }
}