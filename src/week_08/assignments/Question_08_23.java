package week_08.assignments;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {

        // Get the input and create a matrix
        int[][] binaryMatrix = getAMatrix();

        // Control the columns and rows then display the result
        System.out.printf("The flipped cell is at (%d, %d)", controlOfRows(binaryMatrix), controlOfColumns(binaryMatrix));
    }

    public static int[][] getAMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        int[][] m = new int[6][6];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = input.nextInt();
            }
        }
        return m;
    }

    public static int controlOfRows(int[][] m) {
        int detector = -1;
        for (int row = 0; row < m.length; row++) {
            int total = 0;
            for (int column = 0; column < m[0].length; column++) {
                total += m[row][column];
            }
            if (total % 2 != 0) {
                detector = row;
                break;
            }
        }
        return detector;
    }

    public static int controlOfColumns(int[][] m) {
        int detector = 0;
        for (int column = 0; column < m[0].length; column++) {
            int total = 0;
            for (int row = 0; row < m.length; row++) {
                total += m[row][column];
            }
            if (total % 2 != 0) {
                detector = column;
                break;
            }
        }
        return detector;
    }
}
