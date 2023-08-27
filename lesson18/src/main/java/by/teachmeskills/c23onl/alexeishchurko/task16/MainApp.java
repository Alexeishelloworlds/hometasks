package by.teachmeskills.c23onl.alexeishchurko.task16;

import by.teachmeskills.c23onl.alexeishchurko.task16.domain.City;
import by.teachmeskills.c23onl.alexeishchurko.task16.domain.Student;
import by.teachmeskills.c23onl.alexeishchurko.task16.service.CityService;
import by.teachmeskills.c23onl.alexeishchurko.task16.service.StudentService;

import java.sql.*;

public class MainApp {

    // Задача:
    // 1) Создать таблицу с данными студентов группы.
    // 2) Создать таблицу с городами, где живут студенты.
    // Создать Java приложение для получения списка всех студентов группы.
    // 3) Вывести информацию о каждом студенте группы и его родном городе.
    // Предусмотреть операции:
    // 4) добавления новых городов,
    // 5) добавления новых студентов,
    // 6) удаления городов.
    // 7) удаления студентов
    public static void main(String[] args) throws SQLException {
        StudentService studentService = new StudentService();
        CityService cityService = new CityService();
        // 3
        studentService.showAllStudents();
        // 4
        cityService.addCity(new City("Vilnius"));
        // 5
        studentService.addStudent(new Student("somebody11", new City("Rome")));
        Student student = studentService.addStudent(new Student("somebody12", new City("Vilnius")));
        System.out.println("------------------------");
        studentService.showAllStudents();
        System.out.println("------------------------");
        // 6
        cityService.deleteCity(new City("Vilnius"));
        // 7
        studentService.deleteStudent(student);

        studentService.addStudent(new Student("somebody12", new City("Madrid")));
        System.out.println("------------------------");
        studentService.showAllStudents();

        studentService.addStudent(new Student("somebody12", new City("Madrid")));

        System.out.println("------------------------");
        studentService.showAllStudents();
    }
}