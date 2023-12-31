package by.teachmeskills.c23onl.alexeishchurko.task16.config;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionConfig {

    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/students", "postgres", "postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}