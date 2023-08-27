package by.teachmeskills.c23onl.alexeishchurko.task16.service;

import by.teachmeskills.c23onl.alexeishchurko.task16.config.DataBaseConnectionConfig;
import by.teachmeskills.c23onl.alexeishchurko.task16.domain.City;
import by.teachmeskills.c23onl.alexeishchurko.task16.domain.Student;
import by.teachmeskills.c23onl.alexeishchurko.task16.service.CityService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public static void showAllStudents() throws SQLException {
        for (int i = 0; i < getListFromResultSet().size(); i++) {
            System.out.println((i + 1) + " " + getListFromResultSet().get(i));
        }
    }

    private static List<Student> getListFromResultSet() throws SQLException {
        Connection connection = DataBaseConnectionConfig.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select student_name, city_name from students left join cities on students.city_id = cities.id");
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            String name = resultSet.getString(1);
            String city = resultSet.getString(2);
            Student student = new Student(name, new City(city));
            students.add(student);
        }
        connection.close();
        return students;
    }

    public static Student saveStudent(Student student) throws SQLException {
        Connection connection = DataBaseConnectionConfig.getConnection();

        City city = CityService.saveCity(student.getCity());

        PreparedStatement statement1 = connection.prepareStatement("select * from students where student_name = ?");
        statement1.setString(1, student.getName());
        ResultSet resultSet1 = statement1.executeQuery();
        if (!resultSet1.next()) {
            Statement statement2 = connection.createStatement();
            ResultSet resultSet2 = statement2.executeQuery("select max(id) + 1 from students");
            resultSet2.next();
            int nextId = resultSet2.getInt(1);

            PreparedStatement statement3 = connection.prepareStatement("select id from cities where city_name =  ?");
            statement3.setString(1, city.getCityName());
            ResultSet resultSet3 = statement3.executeQuery();
            resultSet3.next();
            int cityId = resultSet3.getInt(1);

            PreparedStatement statement4 = connection.prepareStatement("insert into students (id, student_name, city_id) values (?, ?, ?)");
            statement4.setInt(1, nextId);
            statement4.setString(2, student.getName());
            statement4.setInt(3, cityId);
            statement4.execute();
        }
        connection.close();
        return student;
    }

    public static void deleteStudent(Student student) throws SQLException {
        Connection connection = DataBaseConnectionConfig.getConnection();

        PreparedStatement statement = connection.prepareStatement("delete from students where student_name = ?");
        statement.setString(1, student.getName());
        statement.execute();

        connection.close();
    }

}