import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String language = req.getParameter("language");
        String information = req.getParameter("information");
        String password = req.getParameter("password");

        try(PrintWriter writer = resp.getWriter()) {
            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h1>");
            writer.println("You are registered");
            writer.println("</h1>");
            writer.println("Name: " + name);
            writer.println("<br>");
            writer.println("Language: " + language);
            writer.println("<br>");
            writer.println("Information: " + information);
            writer.println("<br>");
            writer.println("Password: " + password);
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}
