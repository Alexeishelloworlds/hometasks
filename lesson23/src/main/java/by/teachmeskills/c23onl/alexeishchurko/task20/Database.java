package by.teachmeskills.c23onl.alexeishchurko.task20;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    private static List<Book> books = new ArrayList<>();

    public static List<Book> getByAuthor(String author) {
        if (author == null || author.isBlank()) {
            return books;
        }

        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public static void addBook(Book book) {
        if (!(book.getAuthor().isBlank() || book.getTitle().isBlank())) {
            books.add(book);
        }
    }

    public static void deleteBook(int index) {
        books.remove(index);
    }

    public static List<Book> getBooks() {
        return books;
    }
}