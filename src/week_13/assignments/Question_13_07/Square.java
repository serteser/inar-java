package week_13.assignments.Question_13_07;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this.side = 1;
    }
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "It is created on " + super.getDateCreated() +
                "\ncolor: " + super.getColor() + " and filled: " + super.isFilled() +
                "\nSquare: side: " + this.getSide() +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter();
    }

    @Override
    public double getArea() {
        return Math.pow(this.getSide(), 2);
    }

    @Override
    public double getPerimeter() {
        return this.getSide() * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
