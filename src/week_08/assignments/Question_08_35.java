package week_08.assignments;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {

        int[][] binaryMatrix = getBinaryMatrix();
        int[] subMatrix = findLargestBlock(binaryMatrix);
        System.out.printf("The maximum square sub-matrix is at(%d, %d) with size %d", subMatrix[0], subMatrix[1], subMatrix[2]);
    }

    public static int[][] getBinaryMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int numberOfRows = input.nextInt();
        System.out.println("Enter the matrix row by row:");
        int[][] m = new int[numberOfRows][numberOfRows];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = input.nextInt();
            }
        }
        return m;
    }

    public static boolean controlSubBlocks(int a, int i, int j, int[][] m) {
        int count = 0;
        for (int row = (a * i / a); row < (a * i / a) + a; row++) {
            for (int column = (a * j / a); column < (a * j / a) + a; column++) {
                if (column == m.length) {
                    return false;
                }
                if (m[row][column] == 1) {
                    count++;
                    if (count == a * a) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static int[] findLargestBlock(int[][] m) {
        int[] subMatrix = new int[3];
        for (int s = m.length - 1; s > 1; s--) {
            for (int i = 0; i < m.length; i++) {
                if (i + s == m.length + 1) {
                    break;
                }
                for (int j = 0; j < m[0].length; j++) {
                    if (controlSubBlocks(s, i, j, m)) {
                        subMatrix[0] = i;
                        subMatrix[1] = j;
                        subMatrix[2] = s;
                        return subMatrix;
                    }
                }
            }
        }
        return subMatrix;
    }
}
