package week_08.assignments;

import java.util.Scanner;

public class Question_08_20 {
    public static void main(String[] args) {

        char[][] connectFour = new char[6][7];
        fillBoardWithSpace(connectFour);
        displayEmptyBoard(connectFour);
        playingGame(connectFour);
    }

    public static void displayEmptyBoard(char[][] m) {
        System.out.println();
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                System.out.print("| " + m[row][column] + " ");
            }
            System.out.println("|");
        }
        System.out.print("-----------------------------");
    }

    public static void fillBoardWithSpace(char[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = ' ';
            }
        }
    }

    public static void dropUntil(int column, char[][] m, char ch) {
        for (int i = m.length - 1; i >= 0; i--) {
            if (m[i][column] == (int) (' ')) {
                m[i][column] = ch;
                break;
            }
        }
    }

    public static void playingGame(char[][] m) {
        Scanner input = new Scanner(System.in);
        boolean endOfGame = false;
        do {
            System.out.print("\nDrop a red disk at column (0-6): ");
            int red = input.nextInt();
            dropUntil(red, m, 'R');
            displayEmptyBoard(m);
            if (isGameOver(m)) {
                endOfGame = true;
                break;
            }
            System.out.print("\nDrop a yellow disk at column (0-6): ");
            int yellow = input.nextInt();
            dropUntil(yellow, m, 'Y');
            displayEmptyBoard(m);
            if (isGameOver(m)) {
                endOfGame = true;
                break;
            }
        } while (!endOfGame);

    }

    public static boolean isGameOver(char[][] m) {
        if (controlRows(m) || controlColumns(m) || controlDiagonals(m)) {
            return true;
        }
        return false;
    }

    public static boolean controlRows(char[][] m) {

        for (int row = m.length - 1; row >= 0; row--) {
            int countR = 0;
            int countY = 0;
            for (int column = 0; column < m[0].length; column++) {
                if (m[row][column] == ' ') {
                    countR = 0;
                    countY = 0;
                } else if (m[row][column] == 'R') {
                    countR++;
                    countY = 0;
                    if (countR == 4) {
                        System.out.println("\nThe winner is Red");
                        return true;
                    }
                } else if (m[row][column] == 'Y') {
                    countY++;
                    countR = 0;
                    if (countY == 4) {
                        System.out.println("\nThe winner is Yellow");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean controlColumns(char[][] m) {

        for (int column = 0; column < m[0].length; column++) {
            int countR = 0;
            int countY = 0;
            for (int row = 0; row < m.length; row++) {
                if (m[row][column] == 'R') {
                    countR++;
                    countY = 0;
                    if (countR == 4) {
                        System.out.println("\nThe winner is Red");
                        return true;
                    }
                } else if (m[row][column] == 'Y') {
                    countY++;
                    countR = 0;
                    if (countY == 4) {
                        System.out.println("\nThe winner is Yellow");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean controlDiagonals(char[][] m) {
        for (int row = m.length - 1; row >= 0; row--) {
            for (int column = 0; column < m[0].length; column++) {
                if (controlRightDiagonals(row, column, m) || controlLeftDiagonals(row, column, m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean controlRightDiagonals(int row, int column, char[][] m) {
        if (row < 3) {
            return false;
        }
        if (column > 3) {
            return false;
        }
        if (m[row][column] != ' ') {
            int count = 1;
            int number = m[row][column];
            char ch = (char) (number);
            for (int i = 1; i < 4; i++) {
                if (m[row][column] == m[row - i][column + i]) {
                    count++;
                }
            }
            if (count == 4) {
                System.out.printf((ch == 'R') ? "The winner is Red" : "The winner is Yellow");
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public static boolean controlLeftDiagonals(int row, int column, char[][] m) {
        if (row < 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }
        if (m[row][column] != ' ') {
            int count = 1;
            int number = m[row][column];
            char ch = (char) (number);
            for (int i = 1; i < 4; i++) {
                if (m[row][column] == m[row - i][column - i]) {
                    count++;
                }
            }
            if (count == 4) {
                System.out.printf((ch == 'R') ? "\nThe winner is Red" : "\nThe winner is Yellow");
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
