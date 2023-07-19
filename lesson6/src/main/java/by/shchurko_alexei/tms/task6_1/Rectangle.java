package by.shchurko_alexei.tms.task6_1;

public class Rectangle extends Figure {

    protected int width;
    protected int height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int width, int height) {
        super.name = "Прямоугольник";
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public int getPerimetr() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {

        return width * height;
    }
}
