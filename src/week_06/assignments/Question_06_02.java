package week_06.assignments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long integer = input.nextLong();
        System.out.printf("The sum of the digits in %d is %d", integer, sumDigit(integer));
    }

    public static int sumDigit(long n) {
        String number = n + "";
        int numberLength = number.length();
        int result = 0;
        long digits;
        for (int i = 1, j = 1; j <= numberLength; i *= 10, j++) {

            digits = (n / i) % 10;
            result += (int) digits;
        }

        return result;


    }
}
