package by.teachmeskills.c23onl.alexeishchurko.task28.service;

import by.teachmeskills.c23onl.alexeishchurko.task28.domain.Book;

import java.util.List;

public interface BookService {

    public List<Book> getBooks();

    public void saveBook(Book book);

    public void deleteBook(int index);
}
