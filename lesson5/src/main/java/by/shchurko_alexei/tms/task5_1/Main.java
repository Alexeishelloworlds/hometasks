package by.shchurko_alexei.tms.task5_1;

import by.shchurko_alexei.tms.task5_1.CreditCard;

public class Main {

    // Задача 1: Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1);
        CreditCard card2 = new CreditCard(2);
        CreditCard card3 = new CreditCard(3, 100);

        card1.putMoney(100);
        card2.putMoney(200);
        card3.withdrawMoney(50);

        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}