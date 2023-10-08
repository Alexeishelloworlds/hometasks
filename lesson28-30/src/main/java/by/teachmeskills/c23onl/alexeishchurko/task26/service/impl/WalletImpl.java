package by.teachmeskills.c23onl.alexeishchurko.task26.service.impl;

import by.teachmeskills.c23onl.alexeishchurko.task26.service.Wallet;

public class WalletImpl implements Wallet {

    private int accauntSum;

    public WalletImpl(int sum) {
        this.accauntSum = sum;
    }

    public void setSum(int sum) {
        this.accauntSum = sum;
    }

    public int getSum() {
        return accauntSum;
    }

    @Override
    public void increaseSum(int incSum) {
        accauntSum += incSum;
    }

    @Override
    public void decreaseSum(int decSum) {
        accauntSum -= decSum;
    }
}