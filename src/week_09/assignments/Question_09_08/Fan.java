package week_09.assignments.Question_09_08;

public class Fan {
    final private int SLOW = 1;
    final private int MEDIUM = 2;
    final private int FAST = 3;
    private int speed;
    private boolean isOn;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 1;
        this.isOn = false;
        this.color = "blue";
        this.radius = 5;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius +
                    "\n--------------------------------";
        } else {
            return "Fan color: " + color + ", radius: " + radius + "\nFan is off";
        }

    }

}
