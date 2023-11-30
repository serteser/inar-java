package week_12.assignments.Question_12_05;

public class IllegalTriangleException extends RuntimeException {
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException()  {

    }

    public IllegalTriangleException(double side1, double side2, double side3)  {
        super("The sum of any two sides must be greater than the remaining side");

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


}