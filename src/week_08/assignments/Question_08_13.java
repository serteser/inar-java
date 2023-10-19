package week_08.assignments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {

        // Get a matrix with values provided by user
        double[][] matrix = getAMatrix();

        // Find the location of the largest element, then hold them in an array
        int[] locationOfLargestElement = locateLargest(matrix);

        // Display the result
        System.out.printf("The location of the largest element is at (%d, %d)", locationOfLargestElement[0], locationOfLargestElement[1]);
    }

    public static double[][] getAMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] matrix = new double[row][column];
        System.out.println("Enter the array: ");

        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static int[] locateLargest(double[][] a) {

        int rowIndex = -1;
        int columnIndex = -1;
        double maxNumber = a[0][0];

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[0].length; column++) {
                if (maxNumber < a[row][column]) {
                    maxNumber = a[row][column];
                    rowIndex = row;
                    columnIndex = column;
                }
            }
        }
        return new int[]{rowIndex, columnIndex};
    }


}
