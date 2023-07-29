package by.teachmeskills.c23onl.alexeishchurko.task9.service;

public class StringService {

    public static void getNumberBlocks(String string) {
        System.out.println(string.substring(0, 4) + string.substring(9, 13));
    }

    public static void replaceLetterBlocks(String string) {
        string = string.replace(string.substring(5, 8), "***");
        string = string.replace(string.substring(14, 17), "***");
        System.out.println(string);
    }

    public static void getLetters(String string) {
        string = string.toLowerCase();
        String string1 = string.substring(5, 8);
        String string2 = string.substring(14, 17);
        string = string.substring(18, 22);
        String string3 = string.substring(1, 2);
        String string4 = string.substring(3, 4);
        string = String.join("/", string1, string2, string3, string4);
        System.out.println(string);
    }

    public static void getLettersByStringBuilder(String string) {
        string = string.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.delete(0, 5);
        stringBuilder.replace(3, 9, "/");
        stringBuilder.replace(7, 9, "/");
        stringBuilder.replace(9, 10, "/");
        System.out.println(stringBuilder.toString());
    }

    public static void containsLetters(String string, String letters) {
        System.out.println((string.substring(5, 8).equalsIgnoreCase(letters) || string.substring(14, 17).equalsIgnoreCase(letters)) ? "Номер содержит " + letters : "Номер не содержит " + letters);
    }

    public static void startsWith(String string, String start) {
        System.out.println((string.startsWith(start)) ? "Номер начинается с " + start : "Номер не начинается с " + start);
    }

    public static void endsWith(String string, String end) {
        System.out.println((string.endsWith(end)) ? "Номер заканчивается на " + end : "Номер не заканчивается на " + end);
    }
}
