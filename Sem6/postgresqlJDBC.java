import java.sql.*;
class postgresqlJDBC{
    public static void main(String args[]){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","kkj123");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}