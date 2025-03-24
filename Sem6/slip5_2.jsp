<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Online Quiz</title>
</head>
<body>
    <h2>Online Multiple Choice Test</h2>
    <form action="result.jsp" method="post">
        <%
            // Connect to the database
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "123");

            // Fetch 5 random questions
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM questions ORDER BY RANDOM() LIMIT 5");

            // Display each question and its options
            int questionNumber = 1;
            while (rs.next()) {
                out.println("<p>" + questionNumber + ". " + rs.getString("question") + "</p>");
                out.println("<input type='hidden' name='q" + questionNumber + "' value='" + rs.getInt("id") + "'>");
                out.println("<input type='radio' name='ans" + questionNumber + "' value='1'>" + rs.getString("option1") + "<br>");
                out.println("<input type='radio' name='ans" + questionNumber + "' value='2'>" + rs.getString("option2") + "<br>");
                out.println("<input type='radio' name='ans" + questionNumber + "' value='3'>" + rs.getString("option3") + "<br>");
                out.println("<input type='radio' name='ans" + questionNumber + "' value='4'>" + rs.getString("option4") + "<br><br>");
                questionNumber++;
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        %>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Quiz Result</title>
</head>
<body>
    <h2>Quiz Result</h2>
    <%
        // Initialize score
        int score = 0;

        // Connect to the database
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "123");

        // Prepare a query to fetch the correct answer for a question
        PreparedStatement pstmt = conn.prepareStatement("SELECT correct_option FROM questions WHERE id=?");

        // Check each question's answer
        for (int i = 1; i <= 5; i++) {
            String questionId = request.getParameter("q" + i); // Get question ID
            String userAnswer = request.getParameter("ans" + i); // Get user's answer

            if (questionId != null && userAnswer != null) {
                // Fetch the correct answer from the database
                pstmt.setInt(1, Integer.parseInt(questionId));
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    int correctAnswer = rs.getInt("correct_option");
                    if (correctAnswer == Integer.parseInt(userAnswer)) {
                        score++; // Increment score if the answer is correct
                    }
                }
                rs.close();
            }
        }

        // Close resources
        pstmt.close();
        conn.close();

        // Display the result
        out.println("<h3>Your Score: " + score + " / 5</h3>");
    %>
</body>
</html>

-- Create the questions table
CREATE TABLE questions (
    id SERIAL PRIMARY KEY,          -- Unique ID for each question
    question TEXT NOT NULL,         -- The question text
    option1 TEXT NOT NULL,          -- Option 1
    option2 TEXT NOT NULL,          -- Option 2
    option3 TEXT NOT NULL,          -- Option 3
    option4 TEXT NOT NULL,          -- Option 4
    correct_option INT NOT NULL     -- Correct option (1, 2, 3, or 4)
);

-- Insert very simple questions
INSERT INTO questions (question, option1, option2, option3, option4, correct_option) VALUES
('What is 2 + 2?', '3', '4', '5', '6', 2),
('What is 3 + 3?', '5', '6', '7', '8', 2),
('What is 4 + 4?', '6', '8', '10', '12', 2),
('What is 5 + 5?', '8', '10', '12', '15', 2),
('What is 6 + 6?', '10', '12', '14', '16', 2);