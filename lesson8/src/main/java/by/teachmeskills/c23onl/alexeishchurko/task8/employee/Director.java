package by.teachmeskills.c23onl.alexeishchurko.task8.employee;

import by.teachmeskills.c23onl.alexeishchurko.task8.enums.Department;
import by.teachmeskills.c23onl.alexeishchurko.task8.enums.Post;

public class Director extends Employee {

    private Employee[] subordinates;
    private int numberOfSubordinates;

    public Director(String name, String surname, int workExpireence, Post post, Department department) {
        super(name, surname, workExpireence, Post.DIRECTOR, department);
    }

    public Employee[] getSubordinates() {
        return subordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() * numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Директор отдела " + getDepartment() + " " + super.toString() + ", зарплата: " + calculateSalary();
    }

    public void addSubordinates(Employee... employees) {
        Employee[] temp = new Employee[numberOfSubordinates + employees.length];
        for (int i = 0; i < numberOfSubordinates; i++) {
            temp[i] = subordinates[i];
        }
        for (int i = 0; i < employees.length; i++) {
            temp[numberOfSubordinates + i] = employees[i];
        }
        numberOfSubordinates += employees.length;
        subordinates = temp;
    }
}
