package by.teachmeskills.c23onl.alexeishchurko.task11.impl;

import by.teachmeskills.c23onl.alexeishchurko.task11.interfaces.ArrayList;

public class MyArrayList<T> implements ArrayList<T> {

    private Object[] myArrayList;
    // емкость списка(чтобы не перекопировать часто массив при добавлении элементов)
    private int capacity;
    // размер списка(количество находящихся в списке элементов)
    private int size;

    // конструктор без параметров(создает массив размером по умолчанию)
    public MyArrayList() {
        myArrayList = new Object[10];
        capacity = 10;
    }

    // конструктор с задаваемым размером внутреннего массива
    public MyArrayList(int capacity) {
        myArrayList = new Object[capacity];
        this.capacity = capacity;
    }

    // метод добавления элемента в конец списка(с автоматическим расширением емкости списка)
    @Override
    public void add(T element) {
        if (size == capacity) {
            ensureCapacity(10);
        }
        myArrayList[size] = (T) element;
        size++;
    }

    // метод добавления элемента в список по индексу
    @Override
    public void add(int index, T element) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException("Невозможно добавить элемент. Неправильный индекс!");
        if (size == capacity) {
            ensureCapacity(10);
        }
        if (index == size) {
            myArrayList[size] = (T) element;
            size++;
        } else {
            for (int i = 0; i < size - index; i++) {
                myArrayList[size - i] = myArrayList[size - 1 - i];
            }
            myArrayList[index] = (T) element;
            size++;
        }

    }

    // метод удаления элемента из списка по индексу
    @Override
    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        if (size == 0 || index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Невозможно удалить элемент. Неправильный индекс!");
        for (int i = 0; i < size - index - 1; i++) {
            myArrayList[index + i] = myArrayList[index + 1 + i];
        }
        size--;
    }

    // метод получения элемента из списка по индексу
    @Override
    public T get(int index) throws ArrayIndexOutOfBoundsException {
        if (size == 0 || index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Невозможно получить элемент. Неправильный индекс!");
        return (T) myArrayList[index];
    }

    // метод проверки содержания передаваемого элемента в списке
    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(myArrayList[i])) {
                return true;
            }
        }
        return false;
    }

    // метод очищения списка
    @Override
    public void clear() {
        Object[] clear = new Object[10];
        myArrayList = clear;
        size = 0;
        capacity = 10;

    }

    // метод получения количества элементов в списке
    @Override
    public int size() {
        return size;
    }

    // метод увеличения емкости списка
    public void ensureCapacity(int increase) {
        Object[] temp = new Object[capacity + increase];
        System.arraycopy(myArrayList, 0, temp, 0, size);
        capacity += increase;
        myArrayList = temp;
    }

    // метод преобразования в строку содержимого списка
    @Override
    public String toString() {
        if (isEmpty()) {
            return "list is empty";
        } else {
            String string = myArrayList[0].toString();
            for (int i = 1; i < size; i++) {
                string = string + " " + myArrayList[i].toString();
            }
            return "{" + string + "}";
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
