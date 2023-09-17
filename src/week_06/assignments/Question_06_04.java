package week_06.assignments;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("Display an integer reversed: ");
        reverse(number);
    }

    public static void reverse(int number) {
        String originalNumber = number + "";
        String reverse = "";
        int numberLength = originalNumber.length();
        int digits;
        for (int i = 1, j = 1; j <= numberLength; i *= 10, j++) {

            digits = (number / i) % 10;
            reverse = reverse + digits;
        }
        System.out.print(reverse);

    }
}
