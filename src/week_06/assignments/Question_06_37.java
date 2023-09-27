package week_06.assignments;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its width: ");
        int intForFormat = input.nextInt();
        int intForWidth = input.nextInt();
        System.out.printf("%d formatted to width %d: %s", intForFormat, intForWidth, format(intForFormat, intForWidth));
    }

    public static String format(int number, int width) {
        String sNumber = "" + number;
        if (sNumber.length() >= width) {
            return sNumber;
        } else {
            int numberOfLoops = width - sNumber.length();
            for (int i = 1, j = 0; i <= numberOfLoops; i++) {
                sNumber = j + sNumber;
            }
            return sNumber;
        }

    }
}
