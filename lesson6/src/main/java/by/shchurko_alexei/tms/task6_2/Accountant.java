package by.shchurko_alexei.tms.task6_2;

//Класс Бухгалтер наследующий класс Работник и реализующий интерфейс Распечатать
public class Accountant extends Employee implements Printable {

    protected AccountantSpecialization specialization;

    public Accountant(String name, String surname, Department department, AccountantSpecialization specialization) {
        super.post = Post.ACCOUNTANT;
        super.name = name;
        super.surname = surname;
        super.department = department;
        this.specialization = specialization;
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
        System.out.println("Специализация: " + specialization.getDescription());
    }
}
