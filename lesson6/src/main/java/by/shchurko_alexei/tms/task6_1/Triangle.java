package by.shchurko_alexei.tms.task6_1;

public class Triangle extends Figure {

    protected int side1;
    protected int side2;
    protected int side3;

    public Triangle() {
        this(1, 1, 1);
    }

    //Нужно вроде бы, чтобы сумма 2-х сторон была больше третьей, но я этого не проверяю
    public Triangle(int side1, int side2, int side3) {
        super.name = "Треугольник";
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public int getPerimetr() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        // Нашел формулу Герона. Площадь можно посчитать зная все стороны треугольника:
        //  - сначала необходимо подсчитать разность полупериметра и каждой его стороны.
        //  - потом найти произведение полученных чисел, умножить результат на полупериметр и найти корень из полученного числа.
        double p = getPerimetr() / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }


}
