package week_08.assignments;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] matrix = new char[3][3];
        getGameBoard(matrix);
        displayEmptyBoard(matrix);
        int xR = 0;
        int oR = 0;
        int xC, oC;
        int count = 1;
        boolean isGameOver = true;
        do {
            System.out.printf("Enter a row (0, 1, or 2) for player  %c: ", (count % 2 != 0) ? 'x' : 'O');
            if (count % 2 != 0) {
                xR = input.nextInt();
            } else {
                oR = input.nextInt();
            }
            System.out.printf("Enter a column (0, 1, or 2) for player  %c: ", (count % 2 != 0) ? 'x' : 'O');
            if (count % 2 != 0) {
                xC = input.nextInt();
                matrix[xR][xC] = 'X';
                displayEmptyBoard(matrix);
            } else {
                oC = input.nextInt();
                matrix[oR][oC] = 'O';
                displayEmptyBoard(matrix);
            }
            if (isGameOver(matrix)) {
                isGameOver = false;
                break;
            }
            if (count == 9) {
                System.out.println("No winner in the game!");
                isGameOver = false;
                break;
            }
            count++;
        } while (isGameOver);
    }

    public static boolean isGameOver(char[][] m) {
        boolean isGameOver = false;
        for (int row = 0; row < m.length; row++) {

            int rowTotal = 0;
            for (int column = 0; column < m[0].length; column++) {
                rowTotal += m[row][column];
            }
            if (rowTotal == 264) {
                System.out.println("\nX player won");
                isGameOver = true;
            } else if (rowTotal == 237) {
                System.out.println("\nO player won");
                isGameOver = true;
            }
        }
        for (int column = 0; column < m[0].length; column++) {

            int columnTotal = 0;
            for (int row = 0; row < m.length; row++) {
                columnTotal += m[row][column];
            }
            if (columnTotal == 264) {
                System.out.println("\nX player won");
                isGameOver = true;
            } else if (columnTotal == 237) {
                System.out.println("\nO player won");
                isGameOver = true;
            }
        }
        if (((m[0][0] + m[1][1] + m[2][2]) == 264) || ((m[0][2] + m[1][1] + m[2][0]) == 264)) {
            System.out.println("\nX player won");
            isGameOver = true;
        }
        if (((m[0][0] + m[1][1] + m[2][2]) == 237) || ((m[0][2] + m[1][1] + m[2][0]) == 237)) {
            System.out.println("\nO player won");
            isGameOver = true;
        }
        return isGameOver;
    }

    public static char[][] getGameBoard(char[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = ' ';
            }
        }
        return m;
    }

    public static void displayEmptyBoard(char[][] m) {
        System.out.println("\n-------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("| " + m[i][j] + " ");
            }
            System.out.println("|\n-------------");
        }
    }
}
