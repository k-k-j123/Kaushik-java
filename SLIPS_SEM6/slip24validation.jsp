<%@ page language="java" %>
<%
String username=request.getParameter("uname");
String password=request.getParameter("pass");
if(username.equals(password))
response.sendRedirect("slip22Success.html");
else
response.sendRedirect("slip22Error.html");
%>
