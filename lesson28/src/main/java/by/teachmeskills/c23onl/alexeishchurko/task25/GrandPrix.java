package by.teachmeskills.c23onl.alexeishchurko.task25;

import java.util.ArrayList;
import java.util.List;

public class GrandPrix {
    private String name;
    private List<String> finishers = new ArrayList<>();

    public List<String> getFinishers() {
        return finishers;
    }

    public String getVinner(){
        return finishers.get(0);
    }
}

