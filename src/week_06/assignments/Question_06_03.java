package week_06.assignments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        System.out.println(integer + (isPalindrome(integer) ? " is a palindrome." : " is not a palindrome."));
    }

    public static int reverse(int number) {
        String originalNumber = number + "";
        String reverse = "";
        int numberLength = originalNumber.length();
        int result;
        int digits;
        for (int i = 1, j = 1; j <= numberLength; i *= 10, j++) {

            digits = (number / i) % 10;
            reverse = reverse + digits;
        }
        result = Integer.parseInt(reverse);
        return result;
    }

    public static boolean isPalindrome(int number) {
        boolean result;
        String originalNumber = number + "";
        String reverseNumber = reverse(number) + "";
        if (originalNumber.equals(reverseNumber)) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}
