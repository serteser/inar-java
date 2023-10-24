package week_08.assignments;

import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {

        double[][] points = getMatrix();

        double[] areasOfTriangles = getTriangleArea(points);

        sorted(areasOfTriangles);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
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
        double a = points[0][1] - points[2][1];
        double b = -(points[0][0] - points[2][0]);
        double e = (points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1];
        double c = (points[1][1] - points[3][1]);
        double d = -(points[1][0] - points[3][0]);
        double f = (points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1];
        intersectingPoint[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
        intersectingPoint[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return intersectingPoint;
    }

    public static double getSide(double[] a, double[] b) {
        return Math.sqrt((b[0] - a[0]) * (b[0] - a[0]) + (b[1] - a[1]) * (b[1] - a[1]));
    }

    public static double[] getTriangleArea(double[][] points) {
        double[] a = getIntersectingPoint(points);
        double[] areasOfTriangles = new double[4];
        double s1 = calculateS(1, 0, points, a);
        double s2 = calculateS(3, 0, points, a);
        double s3 = calculateS(3, 2, points, a);
        double s4 = calculateS(1, 2, points, a);
        areasOfTriangles[0] = Math.sqrt(s1 * (s1 - getSide(a, points[0])) * (s1 - getSide(a, points[1])) * (s1 - getSide(points[0], points[1])));
        areasOfTriangles[1] = Math.sqrt(s2 * (s2 - getSide(a, points[0])) * (s2 - getSide(a, points[3])) * (s2 - getSide(points[0], points[3])));
        areasOfTriangles[2] = Math.sqrt(s3 * (s3 - getSide(a, points[3])) * (s3 - getSide(a, points[2])) * (s3 - getSide(points[3], points[2])));
        areasOfTriangles[3] = Math.sqrt(s4 * (s4 - getSide(a, points[1])) * (s4 - getSide(a, points[2])) * (s4 - getSide(points[1], points[2])));
        return areasOfTriangles;
    }

    public static double calculateS(int j, int k, double[][] b, double[] a) {
        return (getSide(a, b[j]) + getSide(a, b[k]) + getSide(b[j], b[k])) / 2;
    }

    public static void sorted(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        System.out.print("The areas are ");
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%2.2f ", list[i]);
        }
    }
}
