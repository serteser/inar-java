package week_10.assignments.Question_10_13;

public class Question_10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        MyRectangle2D r2 = new MyRectangle2D(4, 5, 10.5, 3.2);
        MyRectangle2D r3 = new MyRectangle2D(3, 5, 2.3, 5.4);
        System.out.println("Rectangle :\n------------------------\nArea: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println(r1.contains(3, 3) ? "contains the point (3, 3)." : " does not contains the point (3, 3).");
        System.out.println(r1.contains(r2) ? "contains the rectangle with points (4, 5, 10.5, 3.2)." : "does not contains the rectangle with points (4, 5, 10.5, 3.2).");
        System.out.println(r1.overlaps(r3) ? "overlaps the rectangle with points (3, 5, 2.3, 5.4)." : "does not overlaps the rectangle with points (3, 5, 2.3, 5.4).");
    }
}
