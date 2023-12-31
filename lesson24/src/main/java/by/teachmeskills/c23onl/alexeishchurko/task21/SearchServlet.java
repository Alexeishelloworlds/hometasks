package by.teachmeskills.c23onl.alexeishchurko.task21;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String searchingAuthor = req.getParameter("searchingAuthor");
        List<Book> books = Database.getByAuthor(searchingAuthor);
        req.setAttribute("books", books);
        req.getRequestDispatcher("/WEB-INF/books-jstl.jsp").forward(req, resp);
    }
}