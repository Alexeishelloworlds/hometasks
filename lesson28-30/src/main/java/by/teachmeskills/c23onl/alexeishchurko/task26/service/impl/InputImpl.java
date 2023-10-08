package by.teachmeskills.c23onl.alexeishchurko.task26.service.impl;


import by.teachmeskills.c23onl.alexeishchurko.task26.service.Input;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.Participant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class InputImpl implements Input {
    @Override
    public int getInput(List<Participant> participants) {
        System.out.println("Выберите комманду по номеру:");
        for (int i = 0; i < participants.size(); i++) {
            System.out.println(i + 1 + ": " + participants.get(i).getInfo());
        }
        return new Scanner(System.in).nextInt() - 1;
    }
}


