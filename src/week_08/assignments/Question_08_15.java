package week_08.assignments;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {

        // Get the input create and initialize a matrix
        double[][] points = getAMatrix();

        // Display the result
        System.out.println(sameLine(points) ? "The five points are on the same line" : "The five points are not on the same line");
    }

    public static double[][] getAMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points : ");

        double[][] points = new double[5][2];

        for (int row = 0; row < points.length; row++) {
            for (int column = 0; column < points[0].length; column++) {
                points[row][column] = input.nextDouble();
            }
        }
        return points;
    }

    public static boolean sameLine(double[][] points) {
        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[1][0];
        double y1 = points[1][1];
        double result;
        for (int row = 2; row < points.length; row++) {
            result = (x1 - x0) * (points[row][1] - y0) - (points[row][0] - x0) * (y1 - y0);

            if (result != 0) {
                return false;
            }
        }
        return true;
    }
}
