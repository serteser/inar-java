package week_08.assignments;

import java.util.Scanner;

public class Question_08_27 {
    public static void main(String[] args) {

        double[][] matrix = getAMatrix();
        double[][] sortedMatrix = sortColumns(copyMatrix(matrix));

        System.out.println("The column-sorted array is");
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

    public static double[][] sortColumns(double[][] m) {
        int column = 0;
        while (column < m[0].length) {
            for (int i = 0; i < m[0].length - 1; i++) {
                double currentMin = m[i][column];
                int currentMinIndex = i;
                for (int row = i + 1; row < m[0].length; row++) {
                    if (currentMin > m[row][column]) {
                        currentMin = m[row][column];
                        currentMinIndex = row;
                    }
                }
                if (currentMinIndex != i) {
                    m[currentMinIndex][column] = m[i][column];
                    m[i][column] = currentMin;

                }
            }
            column++;
        }

        return m;
    }

}
