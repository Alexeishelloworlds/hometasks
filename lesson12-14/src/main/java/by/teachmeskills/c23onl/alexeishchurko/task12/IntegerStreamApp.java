package by.teachmeskills.c23onl.alexeishchurko.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class IntegerStreamApp {

    // Задача 1: Создать коллекцию класса ArrayList наполнить ее рандомными элементами элементами типа Integer и с помощью Stream'ов:
    // 1) удалить дубликаты
    // 2) вывести все четные элементы в диапазоне от 7 до 17 (включительно)
    // 3) каждый элемент умножить на 2
    // 4) отсортировать и вывести на экран первых 4 элемента
    // 5) вывести количество элементов в стриме
    // 6) вывести среднее арифметическое всех чисел в стриме
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            elements.add(random.nextInt(20));
        }
        System.out.println(elements);

        System.out.println("1) Удалить все дубликаты:");
        elements.stream()
                .distinct()
                .forEach(element -> System.out.print(element + " "));

        System.out.println("\n2) Все четные элементы в диапазоне от 7 до 17:");
        elements.stream()
                .filter(element -> element >= 7 && element <= 17 && element % 2 == 0)
                .forEach(element -> System.out.print(element + " "));

        System.out.println("\n3) Каждый элемент умножить на 2:");
        elements.stream()
                .map(element -> element * 2)
                .forEach(element -> System.out.print(element + " "));

        System.out.println("\nОтсортированная коллекция:");
        elements.stream()
                .sorted()
                .forEach(element -> System.out.print(element + " "));

        System.out.println("\n4) Первые четыре элемента после сортировки:");
        elements.stream()
                .sorted()
                .limit(4)
                .forEach(element -> System.out.print(element + " "));

        System.out.println("\n5) Количество элементов в стриме:");
        long count = elements.stream().count();
        System.out.println(count);

        System.out.println("6) Cреднее арифметическое всех чисел в стриме:");
        OptionalDouble average = elements.stream()
                .mapToInt(element -> element)
                .average();
        System.out.println(average.getAsDouble());
    }
}