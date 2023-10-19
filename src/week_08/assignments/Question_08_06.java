package week_08.assignments;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {

        // Define the dimensions of array
        final int NUMBERS_OF_ELEMENTS = 9;

        // Create the arrays
        double[] matrix1 = new double[NUMBERS_OF_ELEMENTS];
        double[] matrix2 = new double[NUMBERS_OF_ELEMENTS];

        // Initialize and store each of the value into an array
        System.out.print("Enter matrix1 : ");
        matrix1 = getAn1DimensionalArray(NUMBERS_OF_ELEMENTS);
        System.out.print("Enter matrix2 : ");
        matrix2 = getAn1DimensionalArray(NUMBERS_OF_ELEMENTS);

        // Convert each single dimensional array into two-dimensional array
        double[][] mx1 = convert1To2DimensionalArray(matrix1);
        double[][] mx2 = convert1To2DimensionalArray(matrix2);

        // Multiply two matrices
        double[][] multiply = multiplyMatrix(mx1, mx2);

        // Display the result
        printMultiplied2DimensionalArrays(mx1, mx2, multiply);

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
        int row = (int) Math.sqrt(matrix.length);
        int column = row;
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

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] multiply = new double[a.length][a[0].length];
        for (int row = 0; row < multiply.length; row++) {
            for (int column = 0; column < multiply[0].length; column++) {
                if (row == 0) {
                    multiply[row][column] = (a[row][0] * b[row][column]) + (a[row][1] * b[row + 1][column]) + (a[row][2] * b[row + 2][column]);
                } else  {
                    multiply[row][column] = (a[row][0] * b[0][column]) + (a[row][1] * b[1][column]) + (a[row][2] * b[2][column]);
                }
            }
        }
        return multiply;
    }

    public static void printMultiplied2DimensionalArrays(double[][] a, double[][] b, double[][] c) {
        System.out.println("\nThe multiplication of the matrices is ");
        for (int i = 0; i < a.length; i++) {
            for (int row = i; row <= i; row++) {
                for (int column = 0; column < a[0].length; column++) {
                    System.out.print(a[row][column] + "  ");
                }
            }
            System.out.print((i != a.length / 2) ? "        " : "   *    ");
            for (int row = i; row <= i; row++) {
                for (int column = 0; column < a[0].length; column++) {
                    System.out.print(b[row][column] + "  ");
                }
            }
            System.out.print((i != a.length / 2) ? "        " : "   =    ");
            for (int row = i; row <= i; row++) {
                for (int column = 0; column < a[0].length; column++) {
                    System.out.printf("%5.1f ", c[row][column]);
                }
            }
            System.out.println();
        }
    }
}
