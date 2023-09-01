package week_03.assignments;

import java.util.Scanner;

public class Question_03_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y2 - y1;
        double b = x1 - x2;
        double e = (a * x1) + (b * y1);
        double c = y4 - y3;
        double d = x3 - x4;
        double f = (c * x3) + (d * y3);

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));


        if (((a * d) - (b * c)) != 0) {
            System.out.println("The intersecting point is at (" + (int) (x * 100000) / 100000.0 + ", " + (int) (y * 10000) / 10000.0 + ")");
        } else {
            System.out.println("The two lines are parallel");
        }


    }
}
