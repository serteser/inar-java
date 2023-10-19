package week_08.assignments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of points and elements
        System.out.print("Enter the number of points : ");
        int numberOfPoints = input.nextInt();
        int numberOfElements = numberOfPoints * 2;

        // Create the array
        double[] points = new double[numberOfElements];

        // Initialize and store each of the value into an array
        System.out.printf("Enter %d points : ", numberOfPoints);
        points = getAn1DimensionalArray(numberOfElements);

        // Convert the single dimensional array into two-dimensional array
        double[][] matrixOfPoints = convert1To2DimensionalArray(points);

        System.out.println();
        printAllClosestPoints(matrixOfPoints);

    }

    public static double[] getAn1DimensionalArray(int numbersOfElements) {
        Scanner input = new Scanner(System.in);
        double[] matrix = new double[numbersOfElements];
        for (int i = 0; i < numbersOfElements; i++) {
            matrix[i] = input.nextDouble();
        }
        return matrix;
    }

    public static double[][] convert1To2DimensionalArray(double[] matrix) {
        int row = matrix.length / 2;
        int column = 2;
        int countOfIndex = 0;
        double[][] twoDimensional = new double[row][column];
        for (row = 0; row < twoDimensional.length; row++) {
            for (column = 0; column < twoDimensional[0].length; column++) {
                twoDimensional[row][column] = matrix[countOfIndex];
                countOfIndex++;
            }
        }
        return twoDimensional;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double getShortestDistance(double[][] a) {
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(a[p1][0], a[p1][1], a[p2][0], a[p2][1]);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                double distance = distance(a[i][0], a[i][1], a[j][0], a[j][1]);
                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;

                    shortestDistance = distance;
                }
            }
        }
        return shortestDistance;
    }

    public static void printAllClosestPoints(double[][] a) {
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(a[p1][0], a[p1][1], a[p2][0], a[p2][1]);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                double distance = distance(a[i][0], a[i][1], a[j][0], a[j][1]);
                if (shortestDistance >= distance) {
                    p1 = i;
                    p2 = j;

                    shortestDistance = distance;
                    if (shortestDistance == getShortestDistance(a)) {
                        System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n", a[p1][0], a[p1][1], a[p2][0], a[p2][1]);
                    }
                }
            }
        }
        System.out.printf("Their distance is %.16f", getShortestDistance(a));
    }
}
