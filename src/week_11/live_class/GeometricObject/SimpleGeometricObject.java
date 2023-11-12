package week_11.live_class.GeometricObject;

import java.util.Date;

public class SimpleGeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public SimpleGeometricObject() {
        this("white", false);
        dateCreated = new Date();
    }

    public SimpleGeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
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

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
