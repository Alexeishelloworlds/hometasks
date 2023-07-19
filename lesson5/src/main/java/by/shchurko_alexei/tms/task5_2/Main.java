package by.shchurko_alexei.tms.task5_2;

public class Main {

    //Задача 2: Создать класс для описания компьютера...
    public static void main(String[] args) {
        Ram ram1 = new Ram("Samsung", 32);
        Hdd hdd1 = new Hdd("Toshiba", 1000, false);

        Computer comp1 = new Computer(1500, "Intel core i3");
        Computer comp2 = new Computer(2000, "Intel core i7");
        Computer comp3 = new Computer(3000, "AMD Ryzen геймерский", ram1, hdd1);

        Computer[] computers = new Computer[]{comp1, comp2, comp3};

        for (int i = 0; i < computers.length; i++) {
            System.out.println((i + 1) + ":");
            computers[i].showInfo();
        }


    }
}
