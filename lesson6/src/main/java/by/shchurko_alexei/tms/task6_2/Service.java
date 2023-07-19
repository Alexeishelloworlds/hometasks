package by.shchurko_alexei.tms.task6_2;

//Класс для сервиса
public class Service {

    public void showInfo(Printable... information) {
        for (Printable info : information) {
            info.print();
            System.out.println();
        }
    }
}
