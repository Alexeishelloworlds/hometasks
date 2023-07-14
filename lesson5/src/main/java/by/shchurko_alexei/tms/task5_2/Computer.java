package by.shchurko_alexei.tms.task5_2;

public class Computer {

    protected double price;
    protected String model;
    protected Ram ram;
    protected Hdd hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.hdd = new Hdd();
        this.ram = new Ram();
    }

    public Computer(double price, String model, Ram ram, Hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void showInfo() {
        System.out.println("Компьютер: " + model + " с ценой " + price + " BYN");
        ram.showInfo();
        hdd.showInfo();
    }
}
