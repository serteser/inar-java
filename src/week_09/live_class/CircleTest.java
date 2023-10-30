package week_09.live_class;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle0 = new Circle();
        Circle circle00 = new Circle();
        Circle circle1 = new Circle(13);
        Circle circle2 = new Circle(13);
        Circle circle3 = new Circle(13);
        Circle circle4 = new Circle(13);
        System.out.println(circle1.radius);
        System.out.println(circle.radius);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        circle.setRadius(5);
        System.out.println(circle.getArea());
        System.out.println("************************");
        System.out.println(Circle.numberOfObjects);
        System.out.println(Circle.numberOfObjects);
        System.out.println(Circle.getNumberOfObjects());
    }
}
