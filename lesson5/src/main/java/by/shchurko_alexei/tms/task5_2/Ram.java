package by.shchurko_alexei.tms.task5_2;

public class Ram {

    protected String name;
    protected int capacity;

    public Ram() {
        this("Kingston", 8);
    }

    public Ram(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void showInfo() {
        System.out.println("RAM: " + name + " с объемом " + capacity + " Гб");
    }
}
