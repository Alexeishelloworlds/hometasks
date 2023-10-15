package by.teachmeskills.c23onl.alexeishchurko.task28.web;

import by.teachmeskills.c23onl.alexeishchurko.task28.domain.Book;
import by.teachmeskills.c23onl.alexeishchurko.task28.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    private BookService bookService;

    @Autowired
    public HomeController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ModelAndView homePage() {

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("books", bookService.getBooks());
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView addBook(@Valid Book book, BindingResult bindingResult) {

        ModelAndView modelAndView = new ModelAndView("home");

        if (bindingResult.hasFieldErrors()) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                String field = fieldError.getField();
                String message = fieldError.getDefaultMessage();
                modelAndView.addObject(field + "Error", message);
            }
        } else {
            bookService.saveBook(book);
        }

        modelAndView.addObject("books", bookService.getBooks());
        return modelAndView;
    }

    @PostMapping("/delete")
    public ModelAndView deleteBook(@RequestParam(name = "delete") String index) {
        bookService.deleteBook(Integer.parseInt(index));
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("books", bookService.getBooks());
        return modelAndView;
    }
}
