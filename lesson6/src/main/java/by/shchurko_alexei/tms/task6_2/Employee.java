package by.shchurko_alexei.tms.task6_2;

//Абстрактный класс Работник
public abstract class Employee {

    protected String name;
    protected String surname;
    protected Post post;
    protected Department department;

    public abstract String getName();

    public abstract String getSurname();

    public abstract String getPost();

    public abstract String getDepartment();
}
