package by.teachmeskills.c23onl.alexeishchurko.task23.observer;

import by.teachmeskills.c23onl.alexeishchurko.task23.abstractfabric.ChildrenDayFeastFactoryImpl;

import java.time.LocalDate;

public class Main {

    // Это пример и про Observer и про Abstract fabric
    // использовал свою абстрактную фабрику FeastFactory и её имплементацию ChildrenDayFeastFactoryImpl
    public static void main(String[] args) {

        FeastService feastService = new FeastService();

        Subscriber subscriber1 = new Subscriber("somebody1", FeastCind.FORCHILDREN);
        Subscriber subscriber2 = new Subscriber("somebody2", FeastCind.FORCHILDREN);

        feastService.addObserver(subscriber1);
        feastService.addObserver(subscriber2);

        feastService.addFeast(new Feast("В гостях у Фиксиков",FeastCind.FORCHILDREN, LocalDate.now(),new ChildrenDayFeastFactoryImpl()));
        Feast feast = feastService.searchFeast("В гостях у Фиксиков");
        feast.getOrganizationInfo();
    }
}