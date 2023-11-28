package week_13.assignments.Question_13_06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {

    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return super.getArea() > o.getArea() ? 1 : (super.getArea() < o.getArea() ? -1 : 0);
    }
    @Override
    public String toString() {
        return "It is created on " + super.getDateCreated() +
                "\nColor: " + super.getColor() +
                "\nisFilled: " + super.isFilled() +
                "\nRadius: " + super.getRadius() +
                "\nArea: " + super.getArea() +
                "\nPerimeter: " + super.getPerimeter();
    }
}
