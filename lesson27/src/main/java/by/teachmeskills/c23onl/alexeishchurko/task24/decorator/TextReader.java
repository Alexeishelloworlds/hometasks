package by.teachmeskills.c23onl.alexeishchurko.task24.decorator;

public class TextReader implements TextProcessor {
    @Override
    public String process() {
        // Получение текста из какого-нибудь источника
        return  "We study Java and it is BADWORD good programm language. " +
                "We hope we will learn all it's flowers BADWORD and berries BADWORD";
    }
}