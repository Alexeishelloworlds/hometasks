package by.teachmeskills.c23onl.alexeishchurko.task11.interfaces;

public interface ArrayList<T> extends List<T> {

    //1
    void add(int index, T element) throws ArrayIndexOutOfBoundsException;

    //2
    void remove(int index) throws ArrayIndexOutOfBoundsException;

    //3
    T get(int index) throws ArrayIndexOutOfBoundsException;

}
