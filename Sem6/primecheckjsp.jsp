<h2>Prime number checkrer</h2>
<form method="POST">
	enter a number <input type="text" name="number">
	<input type="submit" value="check">
</form>

<%!
boolean isPrime(int num){
	if(num<=1){
	return false;
	}
	for(int i=2;i<Math.sqrt(num);i++){
		if(num%1==0){
			return false;
		}
	}
	return true;
}
%>

<% if (request.getMethod().equals("POST")){
	int number=Integer.parseInt(request.getParameter("number"));
	boolean isNumberPrime=isPrime(number);
%>
<p> the number <%=number%> is <%=isNumberPrime ? "prime" : "not prime" %></p>
<% } %>


