package by.teachmeskills.c23onl.alexeishchurko.task23.observer;

public interface Observed {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(Object arg);
}