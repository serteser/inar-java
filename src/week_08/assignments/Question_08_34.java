package week_08.assignments;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {

        double[][] points = getPoints();

        double[] rightmostLowestPoint = getRightmostLowestPoint(points);

        System.out.printf("The rightmost lowest point is (%.1f, %.1f)", rightmostLowestPoint[0], rightmostLowestPoint[1]);
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 6 points: ");
        double[][] m = new double[6][2];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = input.nextDouble();
            }
        }
        return m;
    }

    public static double[] getRightmostLowestPoint(double[][] m) {
        double[] r = new double[2];

        for (int row = 0; row < m.length - 1; row++) {
            double currentMin = m[row][1];
            int currentMinIndex = row;
            r = m[row];
            for (int i = row + 1; i < m.length; i++) {
                if (currentMin > m[i][1]) {
                    currentMin = m[i][1];
                    currentMinIndex = i;
                    r = m[i];
                }
            }
            if (currentMinIndex != row) {
                m[currentMinIndex] = m[row];
                m[row] = r;
            }
        }

        double currentMinY = m[0][1];
        for (int row = 0; row < m.length; row++) {
            double currentMinX = m[row][0];
            for (int i = row + 1; i < m.length; i++) {
                if (currentMinY == m[i][1] && currentMinX < m[i][0]) {
                    r = m[i];
                }
            }
        }
        return r;
    }
}
