package by.shchurko_alexei.tms.task5_2;

public class Hdd {

    protected String name;
    protected int capacity;
    protected boolean isInside;

    public Hdd() {
        this("Hitachi", 500, true);
    }

    public Hdd(String name, int capacity, boolean isInside) {
        this.name = name;
        this.capacity = capacity;
        this.isInside = isInside;
    }

    public void showInfo() {
        System.out.println("HDD: " + name + " с объемом " + capacity + " Гб " + ((isInside) ? "внутренний" : "внешний"));
    }

}
