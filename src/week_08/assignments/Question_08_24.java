package week_08.assignments;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {

        int[][] sudoku = getAMatrix();
        System.out.println(isValid(sudoku) ? "Valid solution" : "Invalid solution");
    }

    public static int[][] getAMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution: ");
        int[][] sudoku = new int[9][9];
        for (int row = 0; row < sudoku.length; row++) {
            for (int column = 0; column < sudoku[0].length; column++) {
                sudoku[row][column] = input.nextInt();
            }
        }
        return sudoku;
    }

    public static boolean isValid(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] < 1 || m[i][j] > 9 || !isValidUnique(i, j, m)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidUnique(int i, int j, int[][] m) {
        for (int column = 0; column < 9; column++) {
            if (j != column && m[i][j] == m[i][column]) {
                return false;
            }
        }
        for (int row = 0; row < 9; row++) {
            if (i != row && m[row][j] == m[i][j]) {
                return false;
            }
        }
        for (int row = (3 * (i / 3)); row < (3 * (i / 3)) + 3; row++) {
            for (int column = (3 * (j / 3)); column < (3 * (j / 3)) + 3; column++) {
                if (row != i && column != j && m[row][column] == m[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
