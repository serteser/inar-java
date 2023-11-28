package week_13.assignments.Question_13_12;


import week_13.assignments.Question_13_07.Circle;
import week_13.assignments.Question_13_07.GeometricObject;
import week_13.assignments.Question_13_07.Rectangle;

public class Question_13_12 {
    public static void main(String[] args) {

        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(15);
        objects[1] = new Circle(3);
        objects[2] = new Rectangle(12, 15);
        objects[3] = new Rectangle(11, 24);
        System.out.println("Total area of Geometric Objects: " + sumArea(objects));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
