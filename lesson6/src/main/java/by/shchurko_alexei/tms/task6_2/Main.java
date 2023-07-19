package by.shchurko_alexei.tms.task6_2;

public class Main {

    //Задача 2: Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом, который печатает название
    //          должности и имплементировать этот метод в созданные классы.
    public static void main(String[] args) {

        Printable print1 = new Manager("Петр", "Петров", Department.GENERAL);
        Printable print2 = new Manager("Василий", "Петров", Department.DESIGN);
        Printable print3 = new Manager("Екатерина", "Петрова", Department.ACCOUNTANTING);
        Printable print4 = new Accountant("Василиса", "Петрова", Department.ACCOUNTANTING, AccountantSpecialization.PAYROLL);
        Printable print5 = new Accountant("Елена", "Петрова", Department.TRADE_UNION, AccountantSpecialization.TAX);

        Service service = new Service();
        System.out.println("Работники:");
        service.showInfo(print1, print2, print3, print4, print5);
    }
}
