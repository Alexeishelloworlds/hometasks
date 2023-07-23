package by.teachmeskills.c23onl.alexeishchurko.task8;

import by.teachmeskills.c23onl.alexeishchurko.task8.employee.Director;
import by.teachmeskills.c23onl.alexeishchurko.task8.employee.Worker;
import by.teachmeskills.c23onl.alexeishchurko.task8.enums.Department;
import by.teachmeskills.c23onl.alexeishchurko.task8.enums.Post;
import by.teachmeskills.c23onl.alexeishchurko.task8.service.Service;

public class Main {

    // Задача: создать абстрактный класс Employee...
    // 1) необходимо создать 3 работника и 1 директора. Для каждого сотрудника распечатать полное имя сотрудника и его з/п.
    // 2) Назначить двух созданных сотрудников под управление директора. Распечатать сведения о директоре (инфо о директоре и об его подчинении).
    // 3) Создать нового директора с одним сотрудником (под управлением) и добавить его под управления существующего директора.
    // 4) Убедиться, что сведения о первом директоре теперь включают сведения о втором, который так же добавлен к нему (и т.д.).
    // 5) Создать сервис, который определяет есть ли у данного директора в подчинении (прямом или косвенном) сотрудник с указанным именем (поиск вглубь)
    public static void main(String[] args) {
        Worker worker1 = new Worker("Анна", "Петрова", 1, Post.WORKER, Department.DEVELOPMENT);
        Worker worker2 = new Worker("Павел", "Петров", 2, Post.WORKER, Department.DEVELOPMENT);
        Worker worker3 = new Worker("Анастасия", "Петрова", 3, Post.WORKER, Department.TESTING);

        Director director1 = new Director("Петр", "Петров", 5, Post.DIRECTOR, Department.DEVELOPMENT);
        Director director2 = new Director("Владимир", "Петров", 5, Post.DIRECTOR, Department.TESTING);

        director1.addSubordinates(worker1, worker2);
        director2.addSubordinates(worker3);

        director1.addSubordinates(director2);

        Service hrService = new Service();

        hrService.printEmployeeInfo(worker1, worker2, worker3, director1, director2);

        hrService.printDirectSubordinates(director1);

        hrService.printAllSubordinates(director1);

        hrService.searchEmployee(director1, "Анастасия", "Петрова");
    }
}
