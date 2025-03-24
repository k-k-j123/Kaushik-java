import java.sql.*;
import java.util.*;

class Slip30_2 {

    public static void main(String args[]) {
        int ch;
        Scanner s = new Scanner(System.in);

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "123");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from Teacher1");

            int count = 0;
            while (rs.next()) {
                count++;
            }
            System.out.println("Which Record you want");
            System.out.println("Records are = " + count);

            do {
                System.out.println("1 First \n2 Last \n3 Next \n4 Previous \n0 Exit");
                ch = s.nextInt();

                switch (ch) {
                    case 1:
                        rs.first();
                        System.out.println("Teacher Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Salary: " + rs.getInt(3));
                        break;

                    case 2:
                        rs.last();
                        System.out.println("Teacher Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Salary: " + rs.getInt(3));
                        break;

                    case 3:
                        rs.next();
                        if (rs.isAfterLast()) {
                            System.out.println("Can't move forward");
                        } else {
                            System.out.println("Teacher Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Salary: " + rs.getInt(3));
                        }
                        break;

                    case 4:
                        rs.previous();
                        if (rs.isBeforeFirst()) {
                            System.out.println("Can't move backward");
                        } else {
                            System.out.println("Teacher Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Salary: " + rs.getInt(3));
                        }
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Enter a valid operation");
                }
            } while (ch != 0);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
