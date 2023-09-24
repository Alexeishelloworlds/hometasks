package by.teachmeskills.c23onl.alexeishchurko.task23.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {

    private String name;
    private List<FeastCind> preferredFeastCinds = new ArrayList<>();

    public Subscriber(String name, FeastCind ...  feastCinds) {
        this.name = name;
        for(FeastCind feastCind : feastCinds){
            preferredFeastCinds.add(feastCind);
        }
    }

    @Override
    public void handleEvent(Object arg) {
        if (arg instanceof Feast) {
            Feast feast = (Feast) arg;
            System.out.println("Sending message to " + name + " about event "+ feast.getName() + " " + feast.getDate());
        }
    }
}
