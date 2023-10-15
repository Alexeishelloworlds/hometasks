package by.teachmeskills.c23onl.alexeishchurko.task27.service.impl;

import by.teachmeskills.c23onl.alexeishchurko.task27.domain.Book;
import by.teachmeskills.c23onl.alexeishchurko.task27.exception.BookAddingException;
import by.teachmeskills.c23onl.alexeishchurko.task27.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private List<Book> books = new ArrayList<>();

    @Override
    public void saveBook(Book book) {

        String author = book.getAuthor();
        String title = book.getTitle();

        if(author == null || author.isBlank() || title == null || title.isBlank()) {
            throw new BookAddingException(book);
        }
        books.add(book);
    }
}
