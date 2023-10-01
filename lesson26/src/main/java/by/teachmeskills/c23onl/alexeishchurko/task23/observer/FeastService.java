package by.teachmeskills.c23onl.alexeishchurko.task23.observer;

import java.util.ArrayList;
import java.util.List;

public class FeastService implements Observed {
    // список всех мероприятий разных видов
    private List<Feast> feasts = new ArrayList<>();
    // список подписчиков
    private List<Observer> observers = new ArrayList<>();

    public void addFeast(Feast feast) {
        feasts.add(feast);
        notifyObservers(feast);
    }

    public Feast searchFeast(String name) {
        // Здесь можно использовать stream и возвращать Optional но я просто для примера проинициализировал первым элементом списка мероприятий
        Feast searchingFeast = feasts.get(0);
        for (Feast feast : feasts) {
            if (feast.getName().equals(name)) {
                searchingFeast = feast;
                break;
            }
        }
        return searchingFeast;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        // Рассылка сообщений подписчикам о мероприятии
        // Рассылка всем подписчикам обо всех мероприятиях, но можно сделать взависимости от предпочитаемых видов мероприятий
        if (arg instanceof Feast) {
            Feast feast = (Feast) arg;
            for (Observer o : observers) {
                o.handleEvent(feast);
            }
        }
    }
}
