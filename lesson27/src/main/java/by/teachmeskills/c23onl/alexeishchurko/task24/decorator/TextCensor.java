package by.teachmeskills.c23onl.alexeishchurko.task24.decorator;

public class TextCensor implements TextProcessor {
    private TextProcessor textProcessor;

    public TextCensor(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public String process() {
        //Проверка текста на возможное содержание BADWORDs
        String text = textProcessor.process();
        String[] words = text.split(" ");
        String censuredText = "";
        for (String word : words) {
            if (!word.equalsIgnoreCase("BADWORD")) {
                censuredText = String.join(" ", censuredText, word);
            }
        }
        //String censuredText = text.replace("BADWORD", "");
        return censuredText;
    }
}