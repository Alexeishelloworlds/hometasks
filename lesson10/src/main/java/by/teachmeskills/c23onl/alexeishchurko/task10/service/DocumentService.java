package by.teachmeskills.c23onl.alexeishchurko.task10.service;

import java.io.*;

public class DocumentService {

    public static void sort(String path, String fileName) {
        try (LineNumberReader reader = new LineNumberReader(new FileReader(path + fileName));
             Writer writer1 = new FileWriter(path + "valid numbers.txt");
             Writer writer2 = new FileWriter(path + "invalid numbers.txt")) {

            String string = reader.readLine();
            while (string != null) {
                String isValid = getIsValid(string);
                if (isValid.equals("valid")) {
                    writer1.write(string + "\r\n");
                } else {
                    writer2.write(string + "(" + isValid + ")" + "\r\n");
                }
                string = reader.readLine();
            }
            System.out.println("Cортировка выполнена");
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден!");
        } catch (IOException exc) {
            System.out.println("Возникло исключение!");
        }
    }

    public static String getIsValid(String string) {
        if (string.length() != 15) {
            return "неправильный размер номера";
        } else if (string.startsWith("docnum") || string.startsWith("contract")) {
            return "valid";
        } else {
            return "неправильно начинается";
        }
    }
}