package week_08.assignments;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {

        double[][] points = getPoints();

        getTriangleArea(points);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] m = new double[3][2];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = input.nextDouble();
            }
        }
        return m;
    }

    public static double getSide(double[] a, double[] b) {
        return Math.sqrt((b[0] - a[0]) * (b[0] - a[0]) + (b[1] - a[1]) * (b[1] - a[1]));
    }

    public static double getTriangleArea(double[][] points) {
        double s = (getSide(points[0], points[1]) + getSide(points[0], points[2]) + getSide(points[1], points[2])) / 2;
        double a = Math.sqrt(s * (s - getSide(points[0], points[1])) * (s - getSide(points[0], points[2])) * (s - getSide(points[1], points[2])));
        if (isOnTheSameLine(points)) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("The area of the triangle is %.2f", a);
        }
        return 0;
    }

    public static boolean isOnTheSameLine(double[][] points) {
        if (points[0][0] == points[0][1] && points[1][0] == points[1][1] && points[2][0] == points[2][1]) {
            return true;
        }
        return false;
    }

}
