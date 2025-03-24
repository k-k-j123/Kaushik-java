import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class slip27_2 extends HttpServlet {
    private static final int SESSION_TIMEOUT = 3600; // 1 hour in seconds
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get or create session and set timeout
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(SESSION_TIMEOUT);
        
        // Set response type and send message
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Session inactive timeout has been changed to " + 
                    SESSION_TIMEOUT + " seconds.</h3>");
        out.println("</body></html>");
        out.close();
    }
}