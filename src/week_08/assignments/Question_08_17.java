package week_08.assignments;

import java.util.Scanner;

public class Question_08_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of banks : ");
        int numberOfBank = input.nextInt();
        System.out.println("Enter minimum total of assets for keeping a bank safe : ");
        int minAmountForSafe = input.nextInt();
        double[][] banks = getMatrix(input, numberOfBank);
        int[] unSafeBanks = unSafeBanks(banks, minAmountForSafe);
        displayUnSafeBanks(unSafeBanks);
    }

    public static double[][] getMatrix(Scanner input, int numberOfBank) {
        double[][] n = new double[numberOfBank][6];
        for (int row = 0; row < n.length; row++) {
            System.out.printf("Enter bank %d 's total assets Enter the number of banks that borrowed money from bank %d Enter borrowers ID amount borrowed :\n", row, row);
            for (int column = 0; column < n[0].length; column++) {
                n[row][column] = input.nextDouble();
                if (n[row][1] == 1) {
                    for (column = 2; column < 4; column++) {
                        n[row][column] = input.nextDouble();
                    }
                    break;
                }
            }
        }
        return n;
    }

    public static boolean isBankSafe(double[][] b, int minAmountForSafe, int i) {
        return (minAmountForSafe > (b[i][0] + b[i][3] + b[i][5]));
    }

    public static int[] unSafeBanks(double[][] b, int minAmountForSafe) {
        int[] unSafeBanks = new int[b.length];
        for (int j = 0; j < b.length; j++) {
            if (isBankSafe(b, minAmountForSafe, j)) {
                for (int row = 0; row < b.length; row++) {
                    for (int column = 0; column < b[0].length; column++) {
                        if (b[row][2] == j) {
                            b[row][3] = 0;
                        } else if (b[row][4] == j) {
                            b[row][5] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (isBankSafe(b, minAmountForSafe, i)) {
                unSafeBanks[i] = i - b.length;
            }
        }
        return unSafeBanks;
    }

    public static void displayUnSafeBanks(int[] b) {
        System.out.println("Unsafe banks are: ");
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.print((b[i] + 5) + " ");
            }
        }
    }
}
