package by.teachmeskills.c23onl.alexeishchurko.task16.domain;

public class City {

    private String cityName;

    public City() {
        this.cityName = "Minsk";
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}