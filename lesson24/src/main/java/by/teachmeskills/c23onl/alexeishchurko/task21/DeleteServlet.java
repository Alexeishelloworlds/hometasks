package by.teachmeskills.c23onl.alexeishchurko.task21;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String indexAsString = req.getParameter("delete");
        Database.deleteBook(Integer.parseInt(indexAsString));
        req.setAttribute("books", Database.getBooks());
        req.getRequestDispatcher("/WEB-INF/books-jstl.jsp").forward(req, resp);
    }
}