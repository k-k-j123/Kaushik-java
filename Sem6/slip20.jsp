<@ page language="java" contentType="text/html" charset+"UTF-8" pageEncoding="UTF-8" %>
<h1>convert number to words</h1>
<form method="POST" action="slip20">
	Enter a number <input type="text" name="number">
	<input type="submit" value="Convert">
</form>
<% 
String numberStr=request.getPaarameter("number");
if(numberStr!=null && !numberStr.isEmpty()){
String[] words={"Zero","One","Two","three","four","five","six","seven","eight","nine"};
int number=Integer.parseInt(numberStr);
String numberInWords="";
while(number>0){
int digit=number %10;
numberInWords=words[digit] + "" + numberInWords;
number=number/10;
}
%>
<p> Number:<%=numberStr%></p>
<p style="Color:redl;">Number in words<%= numberInWords.trim()%></p>
<% } %>

