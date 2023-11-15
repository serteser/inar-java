package week_11.assignments.Question_11_06;

public class Circle {
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return "Radius: " + getRadius();
    }
}
