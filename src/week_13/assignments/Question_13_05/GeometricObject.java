package week_13.assignments.Question_13_05;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this("white", false);
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) > 0 ? o1 : o2;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return this.getArea() > o.getArea() ? 1 : (this.getArea() < o.getArea() ? -1 : 0); //  return Double.compare(this.getArea(), o.getArea()); (Also this usage is choosable)

    }

    @Override
    public String toString() {
        return "created on " + this.getDateCreated() + "\ncolor: " + this.getColor() + " and filled: " + this.isFilled();
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
