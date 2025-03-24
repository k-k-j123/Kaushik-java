<html>

<head>
    <title>Customer Search</title>
</head>

<body>

    <h2>Customer Search</h2>

    <form action="http://localhost:8080/examples/Customer" method="post">

        Enter Customer Number:<input type="text" name="customerNumber"><br><br>

        <input type="submit" value="Search">

    </form>

</body>

</html>

//Customer.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Customer extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int cno = Integer.parseInt(request.getParameter("customerNumber"));
response.setContentType("text/html");
PrintWriter out = response.getWriter();
try{
Class.forName("org.postgresql.Driver");
Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "123");
PreparedStatement ps =c.prepareStatement("select * from customer where id=?");
ps.setInt(1, cno);
ResultSet rs =ps.executeQuery();
if(rs.next())
{
out.println("Customer Details");
out.println("Customer Id = "+rs.getInt(1)+"<br><br>");
out.println("Customer Name = "+rs.getString(2));
}
else
{
out.println("Customer Not Found");
response.sendRedirect("Customer.html");
}

}catch(Exception e)
{
e.printStackTrace();
}

}
}