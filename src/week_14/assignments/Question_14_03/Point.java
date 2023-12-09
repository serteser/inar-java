package week_14.assignments.Question_14_03;

public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point() {
        this(1, 1);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {

        if (this.getX() == o.getX()) {

            return this.getY() > o.getY() ? 1 : (this.getY() < o.getY() ? -1 : 0);
        } else {

            return this.getX() > o.getX() ? 1 : (this.getX() < o.getX() ? -1 : 0);
        }
    }

    @Override
    public String toString() {

        return "(" + ((int) (this.getX() * 100)) / 100.0 + ", " + ((int) (this.getY() * 100)) / 100.0 + ")\n";
    }
}
