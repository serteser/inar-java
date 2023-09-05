package week_05.live_class;

import java.util.Scanner;

public class FindingGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        //int number1= (int) (Math.random()*101);
        //int number2= (int) (Math.random()*101);
        int divisor = 1;
        int gcd = 1; // gcd is refer to greatest common divisor

        while (divisor <= Math.min(number1, number2)) {
            if (number1 % divisor == 0 && number2 % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        }
        System.out.printf("\nThe greatest common divisor for %d and %d is \"%d\";", number1, number2, gcd);
    }
}
