package week_13.assignments.Question_13_11;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double lengthOfASide;

    public Octagon() {
        this(1);
    }

    public Octagon(double lengthOfASide) {
        this.lengthOfASide = lengthOfASide;
    }

    public Octagon(double lengthOfASide, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        this.lengthOfASide = lengthOfASide;
    }

    public double getLengthOfASide() {
        return lengthOfASide;
    }

    public void setLengthOfASide(double lengthOfASide) {
        this.lengthOfASide = lengthOfASide;
    }

    @Override
    public double getArea() {
        return (2 * Math.pow(this.getLengthOfASide(), 2) * (1 + (Math.sqrt(2))));
    }

    @Override
    public double getPerimeter() {
        return 8 * this.getLengthOfASide();
    }

    @Override
    public Octagon clone() throws CloneNotSupportedException {
        return (Octagon) super.clone();
    }

    @Override
    public int compareTo(Octagon o) {
        return this.lengthOfASide > o.getLengthOfASide() ? 1 : (this.lengthOfASide < o.getLengthOfASide() ? -1 : 0);
    }

    @Override
    public String toString() {
        return "color: " + super.getColor() + " and filled: " + super.isFilled() +
                "\nOctagon: All sides have equal length: " + this.getLengthOfASide() +
                "\nArea: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter();
    }


}
