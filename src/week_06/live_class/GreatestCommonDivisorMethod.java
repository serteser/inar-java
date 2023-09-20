package week_06.live_class;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter  the second integer: ");
        int number2 = input.nextInt();
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd(number1, number2));

    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;

        for (int i = 2; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;

    }
}
