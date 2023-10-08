package by.teachmeskills.c23onl.alexeishchurko.task26.service.impl;

import by.teachmeskills.c23onl.alexeishchurko.task26.ExecutionTime;
import by.teachmeskills.c23onl.alexeishchurko.task26.domain.Formula1;
import by.teachmeskills.c23onl.alexeishchurko.task26.domain.GrandPrix;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.Competition;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.Participant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RacingCompetitionImpl implements Competition {

    List<Participant> commands = new ArrayList<>();

    public RacingCompetitionImpl(List<Participant> commands) {
        this.commands = commands;
    }

    @Override
    public List<Participant> getParticipants() {
        return commands;
    }

    @ExecutionTime
    @Override
    public int compete() {
        GrandPrix grandPrix = new GrandPrix();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < commands.size(); i++) {
            Thread t = new Thread(new Formula1(grandPrix), Integer.toString(i));
            threads.add(t);
        }

        System.out.println("Гонка...");
        for (Thread t : threads) {
            t.start();
        }

        for (int i = 0; i < threads.size(); ) {
            if (!threads.get(i).isAlive()) i++;
        }

        return grandPrix.getVinner();
    }

}
