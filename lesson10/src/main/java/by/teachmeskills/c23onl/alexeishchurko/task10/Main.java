package by.teachmeskills.c23onl.alexeishchurko.task10;

import by.teachmeskills.c23onl.alexeishchurko.task10.service.DocumentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите путь к файлу(например, D://files//):");
        String path = input.nextLine();
        System.out.println("Введите имя файла с расширением(например, numbers.txt):");
        String fileName = input.nextLine();
        DocumentService.sort(path, fileName);
    }
}