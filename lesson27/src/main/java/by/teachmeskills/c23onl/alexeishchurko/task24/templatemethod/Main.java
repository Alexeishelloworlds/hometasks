package by.teachmeskills.c23onl.alexeishchurko.task24.templatemethod;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Name1", "Surname1","group1");
        Student student2 = new Student("Name2", "Surname2", "group2");

        StudentService studentService = new VipStudentService();
        studentService.giveEducation(student1);

        System.out.println("--------------");

        studentService = new OrdinaryStudentService();
        studentService.giveEducation(student2);

    }
}
