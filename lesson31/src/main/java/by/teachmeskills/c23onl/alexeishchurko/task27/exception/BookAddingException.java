package by.teachmeskills.c23onl.alexeishchurko.task27.exception;

import by.teachmeskills.c23onl.alexeishchurko.task27.domain.Book;

public class BookAddingException extends RuntimeException {

    private Book book;

    public BookAddingException(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
