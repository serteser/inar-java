package week_08.assignments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        for (int column = 0; column < matrix[0].length; column++) {
            System.out.printf("Sum of the elements at column %d is %.1f\n", column, sumColumn(matrix, column));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sumOfThisColumn = 0;
        for (int row = 0; row < m.length; row++) {
            sumOfThisColumn += m[row][columnIndex];
        }
        return sumOfThisColumn;
    }
}
