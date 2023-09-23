package by.teachmeskills.c23onl.alexeishchurko.task21;

import by.teachmeskills.c23onl.alexeishchurko.task21.Book;
import by.teachmeskills.c23onl.alexeishchurko.task21.Database;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String addingAuthor = req.getParameter("addingAuthor");
        String addingTitle = req.getParameter("addingTitle");
        Database.addBook(new Book(addingTitle, addingAuthor));
        req.setAttribute("books", Database.getBooks());
        req.getRequestDispatcher("/WEB-INF/books-jstl.jsp").forward(req, resp);
    }
}