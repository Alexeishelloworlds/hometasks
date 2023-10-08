package by.teachmeskills.c23onl.alexeishchurko.task24.templatemethod;

public class Student {
    String name;
    String surname;
    String group;

    public Student(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    @Override
    public String toString() {
        return "студента " + "surname: " + surname + " " + "name: " + name + " в группу " + group;
    }
}
