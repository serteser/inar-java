package week_12.assignments.Question_12_05;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        isTriangle(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public void isTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        double a = side1 + side2;
        double b = side1 + side3;
        double c = side2 + side3;
        if (!(a > side3) || !(b > side2) || !(c > side1)) {
            throw new IllegalTriangleException();
        }
    }

}