package week_08.assignments;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {

        double[][] points = getMatrix();

        getIntersectingPoint(points);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] m = new double[4][2];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = input.nextDouble();
            }
        }
        return m;
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersectingPoint = new double[2];
        double a = points[1][1] - points[0][1];
        double b = points[0][0] - points[1][0];
        double e = (a * points[0][0]) + (b * points[0][1]);
        double c = points[3][1] - points[2][1];
        double d = points[2][0] - points[3][0];
        double f = (c * points[2][0]) + (d * points[2][1]);

        if ((a * d) - (b * c) == 0) {
            System.out.println("The two lines are parallel");
            return null;
        } else {
            intersectingPoint[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
            intersectingPoint[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.printf("The intersecting point is at (%.5f, %.4f)", intersectingPoint[0], intersectingPoint[1]);
            return intersectingPoint;
        }
    }
}
