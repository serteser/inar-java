package week_13.assignments.Question_13_07;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {

        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public String toString() {
        return "It is created on " + super.getDateCreated() +
                "\nColor: " + super.getColor() +
                "\nisFilled: " + super.isFilled() +
                "\nRadius: " + this.getRadius() +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter();
    }
}
