package by.teachmeskills.c23onl.alexeishchurko.task24.templatemethod;

public class VipStudentService extends StudentService{

    @Override
    public void getPayment() {
        System.out.println("Получить $$$$");
    }

    @Override
    public void study() {
        System.out.println("Обеспечить Яблочной техникой");
        System.out.println("Позвать преподавать Билла Гейтса, Джеймса Гослинга про Java и Райана Гослинга тоже - пусть про UI что-нибудь расскажет");
    }

    @Override
    public void findJob() {
        System.out.println("Устроить в Google или Apple");
    }
}
