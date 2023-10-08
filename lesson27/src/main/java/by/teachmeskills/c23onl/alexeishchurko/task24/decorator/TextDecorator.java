package by.teachmeskills.c23onl.alexeishchurko.task24.decorator;

import java.time.LocalDate;

public class TextDecorator implements TextProcessor {

    private TextProcessor textProcessor;

    public TextDecorator(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public String process() {

        // Оформление текста, добавление реквизитов
        return """
                ------------------------------------------
                Name: ... 
                Surname: ...
                contact number: ...
                ------------------------------------------
                                   Information:              
                                                          """
                +
                textProcessor.process()
                +
                """
                
                ----------------------------
                Date: """
                + LocalDate.now();

    }
}