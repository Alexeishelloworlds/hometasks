package by.teachmeskills.c23onl.alexeishchurko.task26.service;

// интерфейс Кошелька
public interface Wallet {

    void increaseSum(int incSum);

    void decreaseSum(int decSum);

    int getSum();
}
