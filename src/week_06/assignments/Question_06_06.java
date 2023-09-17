package week_06.assignments;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        displayPattern(rows);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("%2d ", i - k);
            }
            System.out.println();
        }
    }
}
