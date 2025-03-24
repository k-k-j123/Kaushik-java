<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>String Reversal</title>
</head>
<body>
    <div class="container">
        <h2>Reverse String</h2>
        
        <form method="post">
            <label for="str">Enter a String:</label>
            <input type="text" name="str" id="str" required>
            <input type="submit" value="Reverse">
        </form>
        
        <% 
        if (request.getMethod().equals("POST")) {
            String st = request.getParameter("str");
            StringBuffer sb = new StringBuffer(st);
            sb = sb.reverse();
        %>
        <div class="result">
            <p>The Reverse String is: <strong><%= sb %></strong></p>
        </div>
        <% } %>
    </div>
</body>
</html>