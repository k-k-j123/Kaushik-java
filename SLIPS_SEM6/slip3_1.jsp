<%@page import="java.sql.*","java.util.*"%>
<h2>Patient details</h2>
<table>
    <tr>
        <th>patient number</th>
        <th>name</th>
        <th>address</th>
        <th>age</th>
        <th>disease</th>
    </tr>

    <%
    try{
        Class.forName("org.postgresql.Driver");
        Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","123");
        Statement st=c.createStatement();
        RessultSet rs=st.executeQuery("Select * from patients");
        while(rs.next()){
    %>
    <tr>
        <td><% rs.getInt(1)%></td>
        <td><% rs.getString(2)%></td>
        <td><% rs.getString(3)%></td>
        <td><% rs.getString(4)%></td>
        <td><% rs.getString(5)%></td>
    </tr>
    <%
        }
        rs.close();
        st.close();
        c.close();
    }
    catch(Exception e){}
    %>
</table>