package by.teachmeskills.c23onl.alexeishchurko.task8.service;

import by.teachmeskills.c23onl.alexeishchurko.task8.employee.Director;
import by.teachmeskills.c23onl.alexeishchurko.task8.employee.Employee;

public class Service {

    private boolean isFound;

    public void searchEmployee(Director director, String name, String surname) {
        isFound = false;
        System.out.println((search(director, name, surname)) ? "Сотрудник найден" : "Сотрудник не найден");
    }

    private boolean search(Director director, String name, String surname) {
        for (Employee subordinate : director.getSubordinates()) {
            if (isFound) {
                return true;
            } else if (name.equals(subordinate.getName()) && surname.equals(subordinate.getSurname())) {
                System.out.println(subordinate.toString());
                isFound = true;
                return true;
            } else if (subordinate.getPost().name() == "DIRECTOR") {
                search((Director) subordinate, name, surname);
            }
        }
        return isFound;
    }

    public void printDirectSubordinates(Director director) {
        System.out.println(director.toString());
        System.out.println("Непосредственные подчиненные:");
        for (Employee subordinate : director.getSubordinates()) {
            System.out.println(subordinate.toString());
        }
        System.out.println();
    }

    public void printAllSubordinates(Director director) {
        printDirectSubordinates(director);
        for (Employee subordinate : director.getSubordinates()) {
            if (subordinate.getPost().name() == "DIRECTOR") {
                printAllSubordinates((Director) subordinate);
            }
        }
        return;
    }

    public void printEmployeeInfo(Employee... employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
