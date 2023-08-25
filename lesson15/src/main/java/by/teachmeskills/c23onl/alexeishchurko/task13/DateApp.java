package by.teachmeskills.c23onl.alexeishchurko.task13;

import java.time.LocalDate;
import java.util.Scanner;

public class DateApp {

    // Задача:
    // 1) Написать программу для вывода на консоль названия дня недели по введенной дате.
    // 2) Написать программу для вывода на экран дату следующего вторника.
    public static void main(String[] args) {
        // 1
        System.out.println("Введите дату в формате YYYY-MM-DD:");
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.parse(input.nextLine());
        int dayOfWeek = date.getDayOfWeek().getValue();
        switch (dayOfWeek) {
            case 1 -> System.out.println("это понедельник");
            case 2 -> System.out.println("это вторник");
            case 3 -> System.out.println("это среда");
            case 4 -> System.out.println("это четверг");
            case 5 -> System.out.println("это пятница");
            case 6 -> System.out.println("это суббота");
            case 7 -> System.out.println("это воскресенье");
        }
        // 2
        System.out.println("дата следующего вторника: " + date.plusDays(7 - dayOfWeek + 2));
    }
}