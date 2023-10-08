package by.teachmeskills.c23onl.alexeishchurko.task24.decorator;

public class Main {

    public static void main(String[] args) {
        TextProcessor textProcessor = new TextDecorator(new TextCensor(new TextReader()));
        System.out.println(textProcessor.process());
    }
}