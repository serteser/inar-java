package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int divisor = 1;
        int gcd = 1; // Greatest Common Divisor

        while (divisor <= Math.min(number1, number2)) {
            if (number1 % divisor == 0 && number2 % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        }
        System.out.printf("The greatest common divisor for %d and %d is %d", number1, number2, gcd);
    }
}
