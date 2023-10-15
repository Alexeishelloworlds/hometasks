package by.teachmeskills.c23onl.alexeishchurko.task28.service.impl;

import by.teachmeskills.c23onl.alexeishchurko.task28.domain.Book;
import by.teachmeskills.c23onl.alexeishchurko.task28.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void saveBook(Book book) {
        books.add(book);
    }

    // удаление книги
    @Override
    public void deleteBook(int index) {
        books.remove(index);
    }
}
