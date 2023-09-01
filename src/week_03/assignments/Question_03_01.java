package week_03.assignments;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double r1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
            double r2 = (-b - Math.pow(delta, 0.5)) / 2 * a;
            System.out.println("The equation has two roots " + (int) (r1 * 1000000) / 1000000.0 + " and " + (int) (r2 * 100000) / 100000.0);
        }
        if (delta == 0) {
            double r1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
            double r2 = (-b - Math.pow(delta, 0.5)) / 2 * a;
            System.out.println("The equation has one root " + (int) (r1));
        }
        if (delta < 0) {
            double r1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
            double r2 = (-b - Math.pow(delta, 0.5)) / 2 * a;
            System.out.println("The equation has no real roots ");
        }
    }
}
