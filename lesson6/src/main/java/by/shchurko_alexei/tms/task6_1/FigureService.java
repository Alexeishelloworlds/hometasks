package by.shchurko_alexei.tms.task6_1;

public class FigureService {

    public void showSymmaryPerimetr(Figure... figures) {
        int sum = 0;
        System.out.println("Фигуры:");
        for (int i = 0; i < figures.length; i++) {
            System.out.println((i + 1) + ": " + figures[i].getName() + " с периметром: " + figures[i].getPerimetr());
            sum += figures[i].getPerimetr();
        }
        System.out.println("Cумма периметров фигур: " + sum);
    }
}
