package by.teachmeskills.c23onl.alexeishchurko.task24.templatemethod;

public class OrdinaryStudentService extends StudentService{

    @Override
    public void getPayment() {
        System.out.println("Оформить рассрочку");
    }

    @Override
    public void study() {
        System.out.println("Отпреподавать от цветочков и до Wildberriesов");
        System.out.println("Дешево, но сердито");
    }

    @Override
    public void findJob() {
        System.out.println("Скинуть ссылку на чат с вакансиями");
        System.out.println("Помочь составить резюме");
    }
}
