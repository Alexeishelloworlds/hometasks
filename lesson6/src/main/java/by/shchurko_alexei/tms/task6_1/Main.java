package by.shchurko_alexei.tms.task6_1;

public class Main {

    //Задача 1: Написать иерархию классов «Фигуры»(Треугольник, прямоугольник, круг). Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
    //          периметра. Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.
    public static void main(String[] args) {
        Figure fig1 = new Rectangle(2, 2);
        Figure fig2 = new Rectangle(5, 5);
        Figure fig3 = new Triangle(3, 3, 5);
        Figure fig4 = new Triangle(7, 7, 7);
        Figure fig5 = new Triangle(10, 10, 10);

        FigureService service = new FigureService();
        service.showSymmaryPerimetr(fig1, fig2, fig3, fig4, fig5);
    }
}
