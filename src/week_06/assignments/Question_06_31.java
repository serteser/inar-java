package week_06.assignments;

import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long cardNumber = input.nextLong();
        System.out.print(cardNumber);
        System.out.println(isValid(cardNumber) ? " is valid" : " is invalid");
    }

    public static boolean isValid(long cardNumber) {
        long moduleOfSumOfCardNumber = ((sumOfOddPlace(cardNumber) + (sumOfDoubleEvenPlace(cardNumber)) % 10));
        if (!(16 <= getSize(cardNumber) && getSize(cardNumber) >= 13) || moduleOfSumOfCardNumber != 0 || !prefixMatched(cardNumber)) {
            return false;
        }
        return true;
    }

    public static int getSize(long d) {
        String s = "" + d;
        return s.length();
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String s = "" + number;
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i += 2) {

            char ch = s.charAt(s.length() - 2 - i);
            if (((ch - '0') * 2) > 9) {
                int firstDigit = ((ch - '0') * 2) % 10;
                int secondDigit = ((ch - '0') * 2) / 10;
                sum += firstDigit + secondDigit;
            } else {
                sum += ((ch - '0') * 2);
            }
        }
        return sum;
    }

    public static int sumOfOddPlace(long number) {
        String s = "" + number;
        int sum = 0;
        for (int i = 0; i <= s.length() - 1; i += 2) {
            char ch = s.charAt(s.length() - 1 - i);
            sum += (ch - '0');
        }
        return sum;
    }

    public static boolean prefixMatched(long number) {
        String s = "" + number;
        return s.startsWith("4") || s.startsWith("5") || s.startsWith("6") || s.startsWith("37");
    }

}
