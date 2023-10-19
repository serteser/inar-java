package week_08.assignments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {

        // Get input and create the matrix
        int[][] matrix = getAMatrix();

        // Display the matrix
        printMatrix(matrix);

        // Control the rows
        controlRows(matrix);

        // Control the columns
        controlColumns(matrix);

        // Control the diagonals
        controlMajorDiagonals(matrix);
        controlSubDiagonals(matrix);

    }

    public static int[][] getAMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int lengthOfSquare = input.nextInt();

        int[][] matrix = new int[lengthOfSquare][lengthOfSquare];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void controlRows(int[][] m) {
        int count = 0;
        int countOfOtherRows = 0;
        for (int row = 0; row < m.length; row++) {
            int total = 0;
            for (int column = 0; column < m[0].length; column++) {
                total += m[row][column];
                count++;
            }
            if (total == 0) {
                System.out.println("All 0s on row " + row);
                countOfOtherRows++;
            } else if (total == m[0].length) {
                System.out.println("All 1s on row " + row);
                countOfOtherRows++;
            } else if (count == Math.pow(m.length, 2) && countOfOtherRows == 0) {
                System.out.print("No same numbers on a row\n");
            }
        }
    }

    public static void controlColumns(int[][] m) {
        int count = 0;
        int countOfOtherColumns = 0;
        for (int column = 0; column < m[0].length; column++) {
            int total = 0;
            for (int row = 0; row < m.length; row++) {
                total += m[row][column];
                count++;
            }
            if (total == 0) {
                System.out.println("All 0s on column " + column);
                countOfOtherColumns++;
            } else if (total == m[0].length) {
                System.out.println("All 1s on column " + column);
                countOfOtherColumns++;
            } else if (count == Math.pow(m.length, 2) && countOfOtherColumns == 0) {
                System.out.print("No same numbers on a column\n");
            }
        }
    }

    public static void controlMajorDiagonals(int[][] m) {
        int totalLeftToRight = 0;
        int totalRightToLeft = 0;
        for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
            totalLeftToRight += m[i][i];
            totalRightToLeft += m[i][j];
        }
        if (totalLeftToRight == m.length) {
            System.out.println("Major diagonal with all 1s left to right");
        } else if (totalLeftToRight == 0) {
            System.out.println("Major diagonal with all 0s left to right");
        } else if (totalRightToLeft == m.length) {
            System.out.println("Major diagonal with all 1s right to left");
        } else if (totalRightToLeft == 0) {
            System.out.println("Major diagonal with all 0s right to left");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }

    }

    public static void controlSubDiagonals(int[][] m) {
        int total1 = 0;
        int count = 0;
        for (int i = 1, j = 0; i < m.length; i++, j++) {
            total1 += m[i][j];
        }
        if (total1 == m.length - 1) {
            System.out.println("Sub-diagonal with all 1s left to right");
            count++;
        } else if (total1 == 0) {
            System.out.println("Sub-diagonal with all 0s left to right");
            count++;
        }
        int total2 = 0;
        for (int j = 1, i = 0; j < m.length; j++, i++) {
            total2 += m[i][j];
        }
        if (total2 == m.length - 1) {
            System.out.println("Sub-diagonal with all 1s left to right");
            count++;
        } else if (total2 == 0) {
            System.out.println("Sub-diagonal with all 0s left to right");
            count++;
        }
        int total3 = 0;
        for (int i = 0, j = m.length - 2; i < m.length - 1; i++, j--) {
            total3 += m[i][j];
        }
        if (total3 == m.length - 1) {
            System.out.println("Sub-diagonal with all 1s right to left");
            count++;
        } else if (total3 == 0) {
            System.out.println("Sub-diagonal with all 0s right to left");
            count++;
        }
        int total4 = 0;
        for (int i = 1, j = m.length - 1; i < m.length; i++, j--) {
            total4 += m[i][j];
        }
        if (total4 == m.length - 1) {
            System.out.println("Sub-diagonal with all 1s right to left");
            count++;
        } else if (total4 == 0) {
            System.out.println("Sub-diagonal with all 0s right to left");
            count++;
        }
        if (count == 0) {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
}
