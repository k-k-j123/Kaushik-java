<%@page import="java.util.*"%>
<%
String name=reqauest.getParameter("uname");
Date d=new Date();
if(d.getHours()<12){
%>
Good Morning <%=name%>
<%
}
else if(d.getHours()<16)
{
%>
Good afternoon <%=name%>
<%
}
else
{
%>
Good evening <%=name%>
<%
}
%>

