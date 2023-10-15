package by.teachmeskills.c23onl.alexeishchurko.task28.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Book {

    @NotNull
    @NotBlank
    private String title;
    @NotNull
    @NotBlank
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
