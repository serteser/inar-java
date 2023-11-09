package week_10.assignments.Question_10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;

    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean contains(double x, double y) {
        return (radius > (Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()))));
    }

    public boolean contains(Circle2D circle) {
        return (((Math.sqrt((circle.getX() - getX()) * (circle.getX() - getX()) + (circle.getY() - getY()) * (circle.getY() - getY()))) <= Math.abs(radius - circle.getRadius())));
    }

    public boolean overlaps(Circle2D circle) {
        return (((Math.sqrt((circle.getX() - getX()) * (circle.getX() - getX()) + (circle.getY() - getY()) * (circle.getY() - getY()))) <= radius + circle.getRadius()));
    }
}
