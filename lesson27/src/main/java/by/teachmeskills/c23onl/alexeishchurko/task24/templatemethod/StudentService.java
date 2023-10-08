package by.teachmeskills.c23onl.alexeishchurko.task24.templatemethod;

public abstract class StudentService {

    public void giveEducation(Student student){
        getPayment();
        System.out.println("Зарегистрировать" + " " + student);
        System.out.println("Добавить в чат");
        System.out.println("Делать напоминание в чат о предстоящем занятии");
        study();
        findJob();
    }
    public abstract void getPayment();
    public abstract void study();
    public abstract void findJob();
}
