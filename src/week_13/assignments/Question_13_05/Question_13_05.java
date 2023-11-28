package week_13.assignments.Question_13_05;

public class Question_13_05 {
    public static void main(String[] args) {

        GeometricObject circle1 = new Circle(5, "green", false);
        GeometricObject circle2 = new Circle(3, "blue", true);
        GeometricObject rectangle1 = new Rectangle(15, 12, "green", true);
        GeometricObject rectangle2 = new Rectangle(10, 12, "purple", false);

        System.out.println("The larger of two circles is :\n" + GeometricObject.max(circle1, circle2));
        System.out.println("\nThe larger of two rectangles is :\n" + GeometricObject.max(rectangle1, rectangle2));


    }
}
