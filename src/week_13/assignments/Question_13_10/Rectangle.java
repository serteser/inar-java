package week_13.assignments.Question_13_10;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object o) {
        Rectangle rectangle = (Rectangle) o;
        return this.getArea() == ((Rectangle) o).getArea();
    }

    @Override
    public int compareTo(Rectangle r) {
        return this.getArea() > r.getArea() ? 1 : (this.getArea() < r.getArea() ? -1 : 0);
    }
}
