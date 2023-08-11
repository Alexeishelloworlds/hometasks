package by.teachmeskills.c23onl.alexeishchurko.task11;

import by.teachmeskills.c23onl.alexeishchurko.task11.impl.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // Задача: Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий работу класса динамической
    // коллекции - т.е. создать свою кастомную коллекцию. В основе коллекции будет массив.
    // Кастомная коллекция должна хранить элементы разных классов(т.е. это generic).
    // Предусмотреть операции:
    // 1) добавления элемента
    // 2) удаления элемента
    // 3) получение элемента по индексу
    // 4) проверка есть ли элемент в коллекции
    // 5) метод очистки всей коллекции.
    // Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
    // Предусмотреть конструктор с задаваемым размером внутреннего массива.
    // Предусмотреть возможность автоматического расширения коллекции при добавлении элемента в том случае, когда коллекция уже заполнена.
    public static void main(String[] args) {
        try {
            MyArrayList<Integer> list = new MyArrayList<>();
            Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            for (Integer i : array) {
                // 1
                list.add(i);
            }
            System.out.println(list.size());
            System.out.println(list.toString());
            // 2
            list.remove(0);
            System.out.println(list.toString());
            // 3
            System.out.println(list.get(1));
            // 4
            System.out.println(list.contains(11));
            // 5
            list.clear();
            System.out.println(list.toString());
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }

        // Доп. задача: Есть массив целых чисел в котором числа могут повторяться
        // 1) Не используя коллекции (или map) найти число которое повторяется большее число раз
        // 2) Решить эту же задачу используя любые структуры данных
        Integer[] numbers = new Integer[]{1, 1, 1, 1, 11};
        System.out.println(Arrays.toString(numbers));
        // 1
        Integer number = 0;
        int maxRepeat = 1;
        int repeat = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (i == 0 || numbers[i] != numbers[i - 1]) {
                repeat = 1;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        repeat++;
                    }
                }
            } else {
                continue;
            }
            if (repeat > maxRepeat) {
                maxRepeat = repeat;
                number = numbers[i];
            }

        }
        if (maxRepeat == 1) {
            System.out.println("Нет повторяющихся чисел");
        } else {
            System.out.println("Число " + number + " повторяется " + maxRepeat + " раз");
        }
        // 2
        number = 0;
        maxRepeat = 1;
        repeat = 0;
        java.util.ArrayList<Integer> list1 = new ArrayList<>();
        for (Integer i : numbers) {
            if (!list1.contains(i)) {
                list1.add(i);
            }
        }
        for (Integer i : list1) {
            repeat = 0;
            for (Integer j : numbers) {
                if (i == j) repeat++;
            }
            if (repeat > maxRepeat) {
                maxRepeat = repeat;
                number = i;
            }
        }
        if (maxRepeat == 1) {
            System.out.println("Нет повторяющихся чисел");
        } else {
            System.out.println("Число " + number + " повторяется " + maxRepeat + " раз");
        }
    }
}
