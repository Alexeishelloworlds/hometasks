package by.teachmeskills.c23onl.alexeishchurko.task12;

import java.util.List;
import java.util.stream.Collectors;

public class StudentsStreamApp {

    // Задача 2: Создать коллекцию класса ArrayList со значениями имен всех студентов в группе и с помощью Strem'ов:
    // 1) Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
    // 2) Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
    // 3) Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста
    public static void main(String[] args) {
        List<String> students = List.of("Somebody1", "Somebody2", "Somebody3", "ALEXEI", "Somebody5");
        System.out.println(students);
        // 1
        long count = students.stream()
                .filter(name -> name.equalsIgnoreCase("Alexei")).count();
        System.out.println(count);
        // 2
        List<String> search = students.stream()
                .filter(name -> name.startsWith("a") || name.startsWith("A")).collect(Collectors.toList());
        System.out.println(search);
        // 3
        String first = students.stream()
                .sorted()
                .findFirst().orElse("Empty");
        System.out.println(first);
    }
}