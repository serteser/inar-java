package week_08.assignments;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a00, a01, a10, a11, b0, and b1: ");
        double[][] a = new double[2][2];
        a[0][0] = input.nextDouble();
        a[0][1] = input.nextDouble();
        a[1][0] = input.nextDouble();
        a[1][1] = input.nextDouble();

        double[] b = new double[2];
        b[0] = input.nextDouble();
        b[1] = input.nextDouble();
        double[] linearEquation = linearEquation(a, b);
        System.out.printf("x is %.1f and y is %.1f", linearEquation[0], linearEquation[1]);
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double[] linearEquation = new double[2];
        if ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0) {
            System.out.println("The equation has no solution.");
            return null;
        } else {
            linearEquation[0] = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
            linearEquation[1] = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        }
        return linearEquation;
    }
}
