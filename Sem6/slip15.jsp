<%@ page language="java" contentType="text/html" charset="UTF-8" pageEncoding="UTF-8"%>
<h1> Calculate sum of first and last digit</h1>
<form method="POST" action="slip15.jsp">
	Enter a number <input type="text" name="number">
	<input type="submit" value="calculate">
</form>
<% 
String numberstr= requese.getParameter("number");
if(numberstr != null && !numberstr.isEmpty()){
int number = Integer.parseInt(numberstr);
int lastDigit=number % 10;
int firstDigit= 0;
while(number !=0){
firstDigit=number % 10;
number=number /10;
}
int sum=firstDigit + lastDigit;
%>
<p>Number: <%= numberstr %></p>
<P>First Digit:<%= firstDigit %></p>
<p>Last Digit<%= lastDigit%></p>
<p style="color: red; font-size:18px;">Sum of first and last Digit:<%=sum%></p>
<% } %>

