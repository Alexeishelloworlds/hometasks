package by.teachmeskills.c23onl.alexeishchurko.task25;

public class Formula1 extends Thread{

    private volatile GrandPrix grandPrix;

    public Formula1(GrandPrix grandPrix) {
        this.grandPrix = grandPrix;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (grandPrix){
            System.out.println(Thread.currentThread().getName());
            grandPrix.getFinishers().add(Thread.currentThread().getName());
        }
    }
}
