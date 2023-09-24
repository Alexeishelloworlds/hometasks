package by.teachmeskills.c23onl.alexeishchurko.task23.observer;

public enum FeastCind {
    FORCHILDREN("Для детей");

    private String description;

    FeastCind(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}