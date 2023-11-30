package week_13.assignments.Question_13_20;

import week_13.assignments.Question_13_17.Complex;

import java.util.Scanner;

public class Question_13_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        quadraticEquations(a, b, c);
    }

    public static void quadraticEquations(double a, double b, double c) {
        double delta = findDelta(a, b, c);
        double[] roots = findRoots(a, b, c);

        if (delta > 0) {

            System.out.printf("The roots are %.6f and %.5f", roots[0], roots[1]);
        }
        if (delta == 0) {

            System.out.printf("The root is %.0f", roots[0]);
        }
        if (delta < 0) {

            roots[0] = -b / (2 * a);
            roots[1] = Math.sqrt(Math.abs(delta)) / 2 * a;
            Complex complex = new Complex(roots[0], roots[1]);
            System.out.printf("The roots are %.1f + %.4fi and ", complex.getRealPart(), complex.getImaginaryPart());
            System.out.printf("%.1f + %.4fi", complex.getRealPart(), -complex.getImaginaryPart());
        }


    }

    public static double findDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double[] findRoots(double a, double b, double c) {

        double delta = findDelta(a, b, c);
        double r1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
        double r2 = (-b - Math.pow(delta, 0.5)) / 2 * a;
        return new double[]{r1, r2};
    }
}
