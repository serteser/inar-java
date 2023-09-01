package week_04.assignments;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of bounding circle: ");
        double radius = input.nextDouble();
        double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
        double sideOfPentagon = 2 * radius * Math.sin(Math.PI / 5);
        double angleOf201 = (Math.acos(((sideOfPentagon * sideOfPentagon) - (2 * radius * radius)) / (-2 * radius * radius)));
        x1 = radius * Math.sin(angleOf201); // alternate interior angle
        y1 = radius * Math.cos(angleOf201); // alternate interior angle
        x2 = 0;
        y2 = radius;
        double angleOf203 = (Math.acos(((sideOfPentagon * sideOfPentagon) - (2 * radius * radius)) / (-2 * radius * radius)));
        x3 = -(radius * Math.sin(angleOf203)); // alternate interior angle
        y3 = radius * Math.cos(angleOf203); // alternate interior angle
        double angleOf405 = (Math.acos(((radius * radius) - (sideOfPentagon * sideOfPentagon) - (radius * radius)) / (-2 * sideOfPentagon * radius)));
        x4 = -(radius * Math.cos(angleOf405));
        y4 = -(radius * Math.sin(angleOf405));
        x5 = (radius * Math.cos(angleOf405));
        y5 = -(radius * Math.sin(angleOf405));

        System.out.println("The coordinates of five points on the pentagon are \n" +
                "(" + (int) (x1 * 10000) / 10000.0 + ", " + (int) (y1 * 10000) / 10000.0 + ")\n" +
                "(" + x2 + ", " + (int) (y2) + ")\n" +
                "(" + (int) (x3 * 10000) / 10000.0 + ", " + (int) (y3 * 10000) / 10000.0 + ")\n" +
                "(" + (int) (x4 * 10000) / 10000.0 + ", " + (int) (y4 * 10000) / 10000.0 + ")\n" +
                "(" + (int) (x5 * 10000) / 10000.0 + ", " + (int) (y5 * 10000) / 10000.0 + ")");


    }
}
