package by.teachmeskills.c23onl.alexeishchurko.task16.domain;

import by.teachmeskills.c23onl.alexeishchurko.task16.domain.City;

public class Student {

    private String name;
    private City city;

    public Student(String name) {
        this(name, new City("Minsk"));
    }

    public Student(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name + " " + city.getCityName();
    }
}