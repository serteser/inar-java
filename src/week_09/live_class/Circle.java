package week_09.live_class;

class Circle {

    double radius;
    public static int numberOfObjects=0;

    public Circle() {
        this(1);

    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
static int getNumberOfObjects(){
        return numberOfObjects;
}
}
