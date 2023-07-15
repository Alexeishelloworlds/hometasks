package by.shchurko_alexei.tms.task6_2;

//Класс Руководитель наследующий класс Работник и реализующий интерфейс Распечатать
public class Manager extends Employee implements Printable {

    public Manager(String name, String surname, Department department) {
        super.post = Post.MANAGER;
        super.name = name;
        super.surname = surname;
        super.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getPost() {
        return post.getDescription();
    }

    @Override
    public String getDepartment() {
        return department.getDescription();
    }

    @Override
    public void print() {
        System.out.println(name + " " + surname);
        System.out.println("Должность: " + post.getDescription());
        System.out.println("Отдел: " + department.getDescription());
    }
}
