package week_14.assignments.Question_14_03;

import java.util.*;

public class Question_14_03 {
    public static void main(String[] args) {

        ArrayList<Point> points = randomGenerate100Points();
        CompareY compare = new CompareY();

        System.out.println("\nThe points in increasing order of their x-coordinates: ");
        Collections.sort(points);
        System.out.println(points);

        System.out.println("\nThe points in increasing order of their y-coordinates: ");
        points.sort(compare);
        System.out.println(points);


    }

    public static ArrayList<Point> randomGenerate100Points() {

        ArrayList<Point> points = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            Point point = new Point(Math.random(), Math.random());

            points.add(point);

        }
        return points;
    }
}
