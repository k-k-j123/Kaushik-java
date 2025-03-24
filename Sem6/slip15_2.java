import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class slip15_2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        Cookie[] cookies = req.getCookies();
        int visitCount = 1;

        if (cookies == null) {
            pw.println("<B>Welcome</B>");
        } else {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("Count")) {
                    visitCount = Integer.parseInt(cookie.getValue()) + 1;
                    break;
                }
            }
            pw.println("Page is visited for " + visitCount + " times");
        }

        Cookie cookie = new Cookie("Count", Integer.toString(visitCount));
        res.addCookie(cookie);
    }
}