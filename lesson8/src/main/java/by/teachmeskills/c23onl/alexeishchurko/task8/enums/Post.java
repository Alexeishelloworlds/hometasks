package by.teachmeskills.c23onl.alexeishchurko.task8.enums;

public enum Post {

    DIRECTOR(2),
    WORKER(1);

    private int postCoefficient;

    Post(int postCoefficient) {
        this.postCoefficient = postCoefficient;
    }

    public int getPostCoefficient() {
        return postCoefficient;
    }
}
