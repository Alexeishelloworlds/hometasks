package by.teachmeskills.c23onl.alexeishchurko.task27.web;

import by.teachmeskills.c23onl.alexeishchurko.task27.exception.BookAddingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BookAddingException.class)
    public String catchException(BookAddingException exc) {
        System.out.println("Incorrect information about book " + exc.getBook());
        return "error";
    }
}
