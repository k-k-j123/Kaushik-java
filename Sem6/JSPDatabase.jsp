<%@page import="java.sql.*,java.util.*"%>
<h2>Patient details</h2>
<table broder="1">
	<tr>
		<th>Patient number</th><th>name</th><th>Address</th><th>age</th><th>disease</th>
	</tr>

	<% 
	try{
	Class.forName("org.postgresql.Driver");
	Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","123");
	Statement st=c.createStatement();
	ResutlSet rs=st.executeQuery("Select * from patient");
	while(rs.next()){
	%>
	<tr>
		<td><% rs.getInt(1) %></td>
		<td><% rs.getString(2) %></td>
		<td><% rs.getString(3) %></td>
		<td><% rs.getInt(4) %></td>
		<td><% rs.getString(5) %></td>
	</tr>

	<%
	}
	rs.close();
	st.close();
	c.close();
	}catch (Exception e){}
	%>
</table>

