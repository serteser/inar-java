package week_08.assignments;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        double[][] matrix = getAMatrix();
        double[][] sortedMatrix = sortRows(copyMatrix(matrix));

        System.out.println("The row-sorted array is");
        displayMatrix(sortedMatrix);

        System.out.println("The original array is");
        displayMatrix(matrix);
    }

    public static double[][] getAMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static void displayMatrix(double[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] copyMatrix(double[][] m) {
        double[][] copyMatrix = new double[3][3];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                copyMatrix[row][column] = m[row][column];
            }
        }
        return copyMatrix;
    }

    public static double[][] sortRows(double[][] m) {
        int row = 0;
        while (row < m.length) {
            for (int i = 0; i < m.length - 1; i++) {
                double currentMin = m[row][i];
                int currentMinIndex = i;
                for (int column = i + 1; column < m[0].length; column++) {
                    if (currentMin > m[row][column]) {
                        currentMin = m[row][column];
                        currentMinIndex = column;
                    }
                }
                if (currentMinIndex != i) {
                    m[row][currentMinIndex] = m[row][i];
                    m[row][i] = currentMin;

                }
            }
            row++;
        }

        return m;
    }

}
