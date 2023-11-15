package week_11.assignments.Question_11_15;

import java.util.Scanner;

public class Question_11_15 {
    public static void main(String[] args) {

        double[][] points = getMatrix();
        printMatrix(points);
        calculateAreaOfAConvexPolygon(points);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        System.out.println("Enter the coordinates of the points: ");
        double[][] points = new double[numberOfPoints][2];
        for (int row = 0; row < points.length; row++) {
            for (int column = 0; column < points[0].length; column++) {
                points[row][column] = input.nextDouble();
            }
        }
        return points;
    }

    public static void printMatrix(double[][] p) {
        for (int row = 0; row < p.length; row++) {
            for (int column = 0; column < p[0].length; column++) {
                System.out.printf("%6.1f", p[row][column]);
            }
            System.out.println();
        }
    }

    public static void calculateAreaOfAConvexPolygon(double[][] p) {
        double total = 0;
        for (int i = 0; i < p.length; i++) {
            if (i == p.length - 1) {
                total += Math.abs((p[1][0] + p[i][0]) * (p[0][1] - p[i][1]));
                break;
            }
            total += Math.abs((p[i + 1][0] + p[i][0]) * (p[i + 1][1] - p[i][1]));

        }
        double area = total / 2.0;
        System.out.printf("The total area is %7.3f",area);
    }
}
