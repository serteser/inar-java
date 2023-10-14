package week_08.assignments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        System.out.printf("Sum of the elements in the major diagonal is %.1f", sumMajorDiagonal(matrix));

    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        int row = 0;
        for (int column = 0; column < m[0].length; column++) {
            sum += m[row][column];
            row++;
        }
        return sum;
    }
}
