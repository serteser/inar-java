package week_08.assignments;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {

        // Get the input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int decimal = input.nextInt();

        // Convert the number from decimal to binary and then install it into an array
        int[] binaryArray = decimalToBinaryArray(decimal, getBinaryPlaces(decimal));

        // Binary array into binary matrix
        int[][] binaryMatrix = binaryArrayToMatrix(binaryArray);

        // Display the result
        printHeadsAndTails(binaryMatrix);
    }

    public static int getBinaryPlaces(int decimal) {
        int total = 0;
        int i = 0;
        boolean isFind = true;
        while (isFind) {
            total += (int) (Math.pow(2, i));
            if (decimal <= total) {
                isFind = false;
                break;
            }
            i++;
        }
        return i + 1;
    }

    public static int[] decimalToBinaryArray(int decimal, int binaryPlaces) {
        int[] binaryArray = new int[binaryPlaces];
        int currentDecimal = decimal;
        for (int i = binaryPlaces - 1, k = 0; i >= 0; i--, k++) {
            int binaryPow = (int) Math.pow(2, i);
            if (currentDecimal >= binaryPow) {
                currentDecimal -= binaryPow;
                binaryArray[k] = 1;
            }
        }
        return binaryArray;
    }

    public static int[][] binaryArrayToMatrix(int[] m) {
        int[][] matrix = new int[3][3];
        int countOfAssignments = 0;
        int indexOfM = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                countOfAssignments++;
                if ((9 - countOfAssignments) <= m.length - 1) {
                    matrix[row][column] = m[indexOfM];
                    indexOfM++;
                }
            }
        }
        return matrix;
    }

    public static void printHeadsAndTails(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                System.out.print((m[row][column] == 0) ? " H " : " T ");
            }
            System.out.println();
        }
    }
}
