package by.teachmeskills.c23onl.alexeishchurko.task23.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import by.teachmeskills.c23onl.alexeishchurko.task23.abstractfabric.*;
import by.teachmeskills.c23onl.alexeishchurko.task23.observer.FeastCind;

public class Feast {

    private String name;
    private FeastCind feastCind;
    private LocalDate date;
    private FeastFactory feastFactory;

    public Feast(String name, FeastCind feastCind, LocalDate date, FeastFactory feastFactory) {
        this.name = name;
        this.feastCind = feastCind;
        this.date = date;
        this.feastFactory = feastFactory;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public FeastCind getFeastCind() {
        return feastCind;
    }

    void getOrganizationInfo(){
        System.out.println("Organization info about feast " + name + ":" );
        System.out.println("Show:");
        feastFactory.getShow().getProgramm();
        System.out.println("Menu:");
        feastFactory.getMenu().getDrinks();
        feastFactory.getMenu().getFood();

    }

}
