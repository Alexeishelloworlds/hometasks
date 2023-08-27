package by.teachmeskills.c23onl.alexeishchurko.task16.service;

import by.teachmeskills.c23onl.alexeishchurko.task16.config.DataBaseConnectionConfig;
import by.teachmeskills.c23onl.alexeishchurko.task16.domain.City;

import java.sql.*;

public class CityService {

    public static City saveCity(City city) throws SQLException {
        Connection connection = DataBaseConnectionConfig.getConnection();

        PreparedStatement statement1 = connection.prepareStatement("select * from cities where city_name = ? ");
        statement1.setString(1, city.getCityName());
        ResultSet resultSet1 = statement1.executeQuery();

        if (!resultSet1.next()) {
            Statement statement2 = connection.createStatement();
            ResultSet resultSet2 = statement2.executeQuery("select max(id) + 1 from cities");
            resultSet2.next();
            int nextId = resultSet2.getInt(1);

            PreparedStatement statement3 = connection.prepareStatement("insert into cities (id, city_name) values (?, ?)");
            statement3.setInt(1, nextId);
            statement3.setString(2, city.getCityName());
            statement3.execute();
        }
        connection.close();
        return city;
    }

    public static void deleteCity(City city) throws SQLException {
        Connection connection = DataBaseConnectionConfig.getConnection();

        PreparedStatement statement1 = connection.prepareStatement("select * from cities where city_name = ?");
        statement1.setString(1, city.getCityName());
        ResultSet resultSet1 = statement1.executeQuery();
        if (resultSet1.next()) {
            PreparedStatement statement2 = connection.prepareStatement("select id from cities where city_name = ?");
            statement2.setString(1, city.getCityName());
            ResultSet resultSet2 = statement2.executeQuery();
            resultSet2.next();
            int cityId = resultSet2.getInt(1);

            PreparedStatement statement3 = connection.prepareStatement("update students set city_id = NULL where city_id = ?");
            statement3.setInt(1, cityId);
            statement3.execute();

            PreparedStatement statement4 = connection.prepareStatement("delete from cities where city_name = ?");
            statement4.setString(1, city.getCityName());
            statement4.execute();
        }
        connection.close();
    }
}