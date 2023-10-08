package by.teachmeskills.c23onl.alexeishchurko.task26.domain;

import java.util.Random;

public class Formula1 extends Thread {

    private volatile GrandPrix grandPrix;

    public Formula1(GrandPrix grandPrix) {
        this.grandPrix = grandPrix;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(10) * 100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (grandPrix) {
            Integer finisher = Integer.valueOf(Thread.currentThread().getName());
            System.out.println((finisher + 1) + " finished");
            grandPrix.getFinishers().add(finisher);
        }
    }
}