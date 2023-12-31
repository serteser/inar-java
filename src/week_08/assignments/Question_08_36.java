package week_08.assignments;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {

        char[][] latinSquare = getCharMatrix();

        System.out.println("The input array is " + (isLatinSquare(latinSquare) ? "" : "not") + " a Latin square");
    }

    public static char[][] getCharMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        System.out.printf("Enter %d rows of letters separated by spaces: \n", n);
        char[][] letters = new char[n][n];
        for (int row = 0; row < letters.length; row++) {
            for (int column = 0; column < letters[0].length; column++) {
                String s = input.next();
                char ch = s.charAt(0);
                letters[row][column] = ch;
                if (ch > 'A' + letters.length) {
                    System.out.printf("Wrong input: the letters must be from %c to %c", 'A', ('A' + letters.length - 1));
                    System.exit(1);
                }
            }
        }
        return letters;
    }

    public static boolean isLatinSquare(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                if (!controlOfRows(i, j, ch) || !controlOfColumns(i, j, ch)) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean controlOfRows(int i, int j, char[][] ch) {
        for (int column = 0; column < ch[0].length; column++) {
            if (column != j && ch[i][column] == ch[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean controlOfColumns(int i, int j, char[][] ch) {
        for (int row = 0; row < ch.length; row++) {
            if (row != i && ch[row][j] == ch[i][j]) {
                return false;
            }
        }
        return true;
    }
}