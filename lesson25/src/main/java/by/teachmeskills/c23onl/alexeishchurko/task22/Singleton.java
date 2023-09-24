package by.teachmeskills.c23onl.alexeishchurko.task22;

public class Singleton {
    private static volatile Singleton instance = null;

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
