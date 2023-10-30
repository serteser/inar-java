package week_09.assignments;

public class Rectangle {
    public double width;
    public double height;

    Rectangle() {
        double width = 1;
        double height = 1;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
