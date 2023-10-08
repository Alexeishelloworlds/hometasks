package by.teachmeskills.c23onl.alexeishchurko.task26.service.impl;


import by.teachmeskills.c23onl.alexeishchurko.task26.service.Bookmaker;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.Competition;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.Input;
import by.teachmeskills.c23onl.alexeishchurko.task26.service.Wallet;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class BookmakerImpl implements Bookmaker {

    private Competition competition;
    private Wallet wallet;
    private Input input;

    public BookmakerImpl(Competition competition, Wallet wallet, Input input) {
        this.competition = competition;
        this.wallet = wallet;
        this.input = input;
    }

    @Override
    public void makeBet() {
        int choose = input.getInput(competition.getParticipants());

        System.out.println("Сделайте ставку:");
        int betSum = new Scanner(System.in).nextInt();

        checkBet(choose, betSum);
    }

    private void checkBet(int choose, int betSum) {
        int winner = competition.compete();
        if (choose == winner) {
            wallet.increaseSum(betSum * 2);
        } else {
            wallet.decreaseSum(betSum);
        }
    }

}
