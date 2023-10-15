package by.teachmeskills.c23onl.alexeishchurko.task27.web;

import by.teachmeskills.c23onl.alexeishchurko.task27.domain.Book;
import by.teachmeskills.c23onl.alexeishchurko.task27.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {

    private BookService bookService;

    @Autowired
    public HomeController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String homePage() {
        return "home";
    }

    @PostMapping
    public String addBook(@RequestParam(name = "addingAuthor") String author,
                          @RequestParam(name = "addingTitle") String title ) {
        Book book = new Book(title, author);
        bookService.saveBook(book);
        return "home";
    }
}
