package by.teachmeskills.c23onl.alexeishchurko.task26;

import by.teachmeskills.c23onl.alexeishchurko.task26.config.Config;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.Bookmaker;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.Wallet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    // в папке resources лежит xml конфигурация
    // в папке config лежат конфигурации с помощью Java кода(Config) и с помощью аннотаций и Java кода(Config2)
    // аннотацией @ExecutionTime помечен метод проведения гонки compete() в классе RacingCompetitionImpl для вычисления длительности его выполнения
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext("by.teachmeskills.c23onl.alexeishchurko.task26.config");

        Bookmaker bookmaker = context.getBean(Bookmaker.class);

        Wallet wallet = context.getBean(Wallet.class);
        System.out.println(wallet.getSum());

        bookmaker.makeBet();

        System.out.println(wallet.getSum());
    }
}