package by.teachmeskills.c23onl.alexeishchurko.task25;

import java.util.Random;
import java.util.Scanner;

public class LudoMain {

    public static void main(String[] args) {
        Bolid bolid1 = new Bolid("bolid1");
        Bolid bolid2 = new Bolid("bolid2");
        Bolid bolid3 = new Bolid("bolid3");

        Driver driver1 = new Driver("driver1");
        Driver driver2 = new Driver("driver2");
        Driver driver3 = new Driver("driver3");

        Command command1 = new Command("command1", bolid1, driver1);
        Command command2 = new Command("command2", bolid2, driver2);
        Command command3 = new Command("command3", bolid3, driver3);

        Bookmaker bookmaker = new Bookmaker("TeachMeSkills");
        bookmaker.addCommand(command1);
        bookmaker.addCommand(command2);
        bookmaker.addCommand(command3);

        System.out.println("Выберите комманду по номеру:");
        bookmaker.showCommands();

        String betCommand = bookmaker.chooseCommand(new Scanner(System.in).nextInt());

        System.out.println("Сделайте ставку:");
        int betSum = new Scanner(System.in).nextInt();

        int resultSum = 0;
        int numberOfGrandPrix = 10;

        for (int i = 0; i < numberOfGrandPrix; i++) {
            GrandPrix grandPrix = new GrandPrix();

            System.out.println("GrandPrix " + (i + 1) + ":");

            // Это для старта )
            boolean start = false;
            while (!start) {
                if (new Random().nextInt(2) == 0) {
                    System.out.println("Выстрел! Старт!");
                    start = true;
                } else {
                    System.out.println("Осечка сигнального пистолета Макарова");
                }
            }

            Thread t1 = new Thread(new Formula1(grandPrix), command1.getName());
            Thread t2 = new Thread(new Formula1(grandPrix), command2.getName());
            Thread t3 = new Thread(new Formula1(grandPrix), command3.getName());


            t1.start();
            t2.start();
            t3.start();

            while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {

            }
            System.out.println("Vinner: " + grandPrix.getVinner());

            resultSum += bookmaker.checkBet(betCommand, betSum, grandPrix.getVinner());
        }

        System.out.println("Поставлено: " + (betSum * numberOfGrandPrix) + " Получено: " + resultSum);

    }

}
