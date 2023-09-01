package week_03.assignments;

import java.util.Scanner;

public class Question_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the circle1's center x-, y-coordinates, radius: ");
        double circle1x = input.nextDouble();
        double circle1y = input.nextDouble();
        double circle1Radius = input.nextDouble();
        System.out.print("Enter the circle2's center x-, y-coordinates, radius: ");
        double circle2x = input.nextDouble();
        double circle2y = input.nextDouble();
        double circle2Radius = input.nextDouble();

        double circle1x0 = 0 - circle1x;
        double circle1y0 = 0 - circle1y;

        double circle2x0 = circle2x + circle1x0;
        double circle2y0 = circle2y + circle1y0;

        if ((circle2x0 + circle2Radius) <= circle1Radius && (circle2y0 + circle2Radius) <= circle1Radius) {
            System.out.println("circle2 is inside circle1");

        }
        if ((circle2x0 + circle2Radius) >= circle1Radius && (circle2y0 + circle2Radius) >= circle1Radius) {
            System.out.println("circle2 does not overlap circle1");
        } else {
            System.out.println("circle2 overlaps circle1");
        }

    }
}
