package by.teachmeskills.c23onl.alexeishchurko.task14;

public class ThreadsApp {

    //Задача: Создать три потока Т1, Т2 и Т3. Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1(используя метод join)
    public static void main(String[] args) {
        Runnable run = () -> System.out.println(Thread.currentThread().getName());
        for (int i = 3; i > 0; i--) {
            String string = String.valueOf(i);
            Thread t = new Thread(run, string);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Main");
    }
}