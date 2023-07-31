package by.teachmeskills.c23onl.alexeishchurko.task9;

import by.teachmeskills.c23onl.alexeishchurko.task9.service.StringService;

public class Main {

    // Задача: Написать программу со следующим функционалом
    // 1) на вход передать строку (будем считать, что это номер документа). Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,а y — это буква.
    // 2) вывести на экран в одну строку два первых блока по 4 цифры.
    // 3) вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    // 4) Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    // 5) вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
    // 6) проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
    // 7) проверить начинается ли номер документа с последовательности 555
    // 8) проверить заканчивается ли номер документа на последовательность 1a2b.
    // Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.
    public static void main(String[] args) {
        //1
        String string = "5553-abc-4567-bbb-1a2b";
        //2
        StringService.getNumberBlocks(string);
        //3
        StringService.replaceLetterBlocks(string);
        //4
        StringService.getLetters(string);
        //5
        StringService.getLettersByStringBuilder(string);
        //6
        StringService.containsLetters(string, "abc");
        //7
        StringService.startsWith(string, "555");
        //8
        StringService.endsWith(string, "1a2b");
    }
}
