package by.shchurko_alexei.tms.task5_1;

public class CreditCard {

    private int accauntNumber;
    private int accauntSum;

    public CreditCard(int accauntNumber) {
        this.accauntNumber = accauntNumber;
    }

    public CreditCard(int accauntNumber, int accauntSum) {
        this.accauntNumber = accauntNumber;
        this.accauntSum = accauntSum;
    }

    public void putMoney(int money) {
        accauntSum += money;
    }

    public void withdrawMoney(int money) {
        accauntSum -= money;
    }

    public void cardInfo() {
        System.out.println("Номер счета: " + accauntNumber + "; " + " Сумма на счете: " + accauntSum);
    }
}
