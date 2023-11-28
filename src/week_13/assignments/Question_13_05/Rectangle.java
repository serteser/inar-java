package week_13.assignments.Question_13_05;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        this.width = width;
        this.height = height;

    }


    public double getWidth() {
        return this.width;
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

    @Override
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

    @Override
    public String toString() {
        return "It is created on " + super.getDateCreated() +
                "\nColor: " + super.getColor() +
                "\nisFilled: " + super.isFilled() +
                "\nWidth: " + this.getWidth() +
                "\nHeight: " + this.getWidth() +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter();

    }
}
