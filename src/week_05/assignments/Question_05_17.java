package week_05.assignments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: "); // Between 1 and 15
        int numberOfStairs = input.nextInt();
        int capture = 0;

        for (int i = 1; i <= numberOfStairs; i++) {
            capture = i;
            for (int j = 1; j <= numberOfStairs - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; i--) {

                System.out.printf("%3d", i);
            }
            i = 2;
            for (int m = capture; m >= i; i++) {

                System.out.printf("%3d", i);
            }
            i = capture;
            System.out.println();
        }

    }
}
