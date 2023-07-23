package by.teachmeskills.c23onl.alexeishchurko.task8.employee;

import by.teachmeskills.c23onl.alexeishchurko.task8.enums.Department;
import by.teachmeskills.c23onl.alexeishchurko.task8.enums.Post;

public class Worker extends Employee {

    public Worker(String name, String surname, int workExpireence, Post post, Department department) {
        super(name, surname, workExpireence, Post.WORKER, department);
    }

    @Override
    public String toString() {
        return "Работник отдела " + getDepartment() + " " + super.toString() + ", зарплата: " + calculateSalary();
    }
}
