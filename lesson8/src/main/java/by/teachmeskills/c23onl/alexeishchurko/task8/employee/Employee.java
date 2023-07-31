package by.teachmeskills.c23onl.alexeishchurko.task8.employee;

import by.teachmeskills.c23onl.alexeishchurko.task8.enums.Department;
import by.teachmeskills.c23onl.alexeishchurko.task8.enums.Post;

public abstract class Employee {

    private static int baseRate = 1000;
    private String name;
    private String surname;
    private int workExpireence;
    private Post post;
    private Department department;

    public Employee(String name, String surname, int workExpireence, Post post, Department department) {
        this.name = name;
        this.surname = surname;
        this.workExpireence = workExpireence;
        this.post = post;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWorkExpireence() {
        return workExpireence;
    }

    public Post getPost() {
        return post;
    }

    public String getDepartment() {
        return department.getDescription();
    }

    public int calculateSalary() {
        return baseRate * post.getPostCoefficient() * department.getDepartmentCoefficient() * workExpireence;
    }

    @Override
    public String toString() {
        return name + " " + surname;

    }
}
