package week_08.assignments;

import java.util.Scanner;

public class Question_08_05 {
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

        // Add two matrices
        double[][] add = add2DimensionalArrays(mx1, mx2);

        // Display the result
        printTotaled2DimensionalArrays(mx1, mx2, add);

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

    public static double[][] add2DimensionalArrays(double[][] a, double[][] b) {
        double[][] add = new double[a.length][a[0].length];
        for (int row = 0; row < add.length; row++) {
            for (int column = 0; column < add[0].length; column++) {
                add[row][column] = (a[row][column]) + (b[row][column]);
            }
        }
        return add;
    }

    public static void printTotaled2DimensionalArrays(double[][] a, double[][] b, double[][] c) {
        System.out.println("\nThe matrices are added as follows");
        for (int i = 0; i < a.length; i++) {
            for (int row = i; row <= i; row++) {
                for (int column = 0; column < a[0].length; column++) {
                    System.out.print(a[row][column] + "  ");
                }
            }
            System.out.print((i != a.length / 2) ? "        " : "   +    ");
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
