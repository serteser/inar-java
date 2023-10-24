package week_08.assignments;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {

        double[][] matrix = getAMatrix();

        System.out.print(isMarkovMatrix(matrix) ? "It is a Markov matrix" : "It is not a Markov matrix" );
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

    public static boolean isMarkovMatrix(double[][] m) {
        for (int column = 0; column < m[0].length; column++) {
            double total = 0;
            for (int row = 0; row < m.length; row++) {

                if (m[row][column] < 0) {
                    return false;
                }
                total += m[row][column];
            }
            if (total != 1) {
                return false;
            }
        }
        return true;
    }
}
