import java.sql.*;

public class ResultSetMetaDataExample {
    public static void main(java.lang.String[] args) {

        Statement s = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        try {
            // Get a database connection and prepare a statement.
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "123");
            s = c.createStatement();
            rs = s.executeQuery("SELECT * FROM  mobile");
            rsmd = rs.getMetaData();
            int colCount = rsmd.getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                System.out.println("Information about column " + i);
                System.out.println("   Name..........: " + rsmd.getColumnName(i));
                System.out.println("   Data Type.....: " + rsmd.getColumnType(i) +" ( " + rsmd.getColumnTypeName(i) + " )");
                System.out.print("   Allows Nulls..: ");
                if (rsmd.isNullable(i) == 0)
                    System.out.println("false");
                else
                    System.out.println("true");
            }
        } catch (Exception e) {
            // Handle any errors.
            System.out.println("Oops... we have an error... " + e);
        }
    }

}
