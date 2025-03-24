<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculate Sum of First and Last Digit</title>
</head>
<body>
    <h1>Calculate Sum of First and Last Digit</h1>
    
    <form method="post" action="slip26_2.jsp">
        Enter a Number: <input type="text" name="number" required pattern="[0-9]+" title="Please enter a valid positive number">
        <input type="submit" value="Calculate">
    </form>
    
    <%
    String numberStr = request.getParameter("number");
    if (numberStr != null && !numberStr.isEmpty()) {
        try {
            // Convert the input string to an integer
            int number = Integer.parseInt(numberStr);
            int originalNumber = number;  // Store original number for display
            
            // Calculate the sum of the first and last digits
            int lastDigit = number % 10;
            int firstDigit = 0;
            
            // Find first digit
            while (number != 0) {
                firstDigit = number % 10;
                number = number / 10;
            }
            
            int sum = firstDigit + lastDigit;
    %>
            <div style="margin-top: 20px;">
                <p>Number: <%= originalNumber %></p>
                <p>First Digit: <%= firstDigit %></p>
                <p>Last Digit: <%= lastDigit %></p>
                <p style="color: red; font-size: 18px;">Sum of First and Last Digit: <%= sum %></p>
            </div>
    <%
        } catch (NumberFormatException e) {
    %>
            <p style="color: red;">Please enter a valid number!</p>
    <%
        }
    }
    %>
</body>
</html>


