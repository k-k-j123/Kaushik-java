<html>
<body>
    <form method='post'>
        User Name:<input type='text' name='uname'><br>
        Age:<input type='text' name='age'><br>
        <input type='submit'><input type='reset'>
    </form>

    <%
    if(request.getParameter("uname") != null && request.getParameter("age") != null) {
        String name = request.getParameter("uname");
        int age = Integer.parseInt(request.getParameter("age"));
        
        if(age > 18) {
            out.println(name + " is eligible for voting");
        } else {
            out.println(name + " is not eligible for voting");
        }
    }
    %>
</body>
</html>
    