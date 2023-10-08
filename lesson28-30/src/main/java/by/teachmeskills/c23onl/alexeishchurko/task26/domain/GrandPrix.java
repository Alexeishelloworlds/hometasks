package by.teachmeskills.c23onl.alexeishchurko.task26.domain;

import java.util.ArrayList;
import java.util.List;

public class GrandPrix {
    private String name;
    private List<Integer> finishers = new ArrayList<>();

    public List<Integer> getFinishers() {
        return finishers;
    }

    public Integer getVinner(){
        return finishers.get(0);
    }
}
