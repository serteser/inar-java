package week_10.assignments.Question_10_11;

public class Question_10_11 {
    public static void main(String[] args) {
        Circle2D circle1 = new Circle2D(2,2,5.5);
        Circle2D circle2 = new Circle2D(4,5,10.5);
        Circle2D circle3 = new Circle2D(3,5,2.3);
        System.out.println("Circle1 area: " + circle1.getArea());
        System.out.println("Circle1 perimeter: " + circle1.getPerimeter());
        System.out.println("Does circle1 contain the point (3, 3)? --> " + circle1.contains(3, 3));
        System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5 ? --> " + circle1.contains(circle2));
        System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3 ? --> " + circle1.overlaps(circle3));
    }
}
