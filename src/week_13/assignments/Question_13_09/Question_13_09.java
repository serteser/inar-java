package week_13.assignments.Question_13_09;

public class Question_13_09 {
    public static void main(String[] args) {

        GeometricObject circle1 = new Circle(5);
        GeometricObject circle2 = new Circle(6);
        GeometricObject circle3 = new Circle(5);

        System.out.println("Circle1 is " + ((circle1.equals(circle2) ? "" : "not") + " equal to Circle2"));
        System.out.println("Circle1 is " + ((circle1.equals(circle3) ? "" : "not") + " equal to Circle3"));
    }
}
