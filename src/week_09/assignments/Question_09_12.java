package week_09.assignments;

import java.util.Scanner;

public class Question_09_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        LinearEquation equation = new LinearEquation();
        displayResult(x1, y1, x2, y2, x3, y3, x4, y4, equation);

    }

    public static void displayResult(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, LinearEquation l) {
        double a = y2 - y1;
        double b = x1 - x2;
        double c = y4 - y3;
        double d = x3 - x4;
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;
        l = new LinearEquation(a, b, c, d, e, f);
        if (l.isSolvable()) {
            System.out.printf("The intersecting point is at (%.5f, %.5f)", l.getX(), l.getY());
        } else if (!l.isSolvable()) {
            System.out.println("The two lines are parallel");
        }
    }

}
