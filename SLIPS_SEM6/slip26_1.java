import java.sql.*;
class slip26_1 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/testdb",
                "postgres", 
                "123"
            );
            
            int empno = Integer.parseInt(args[0]);
            PreparedStatement ps = con.prepareStatement("delete from emp where empid=?");
            ps.setInt(1, empno);
            ps.executeUpdate();
            
            System.out.println("Record deleted successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}