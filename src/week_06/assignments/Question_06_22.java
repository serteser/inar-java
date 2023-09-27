package week_06.assignments;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.printf("The approximated square root of %d is: %.1f", number, (double) Math.round(sqrt(number)));
    }

    public static double sqrt(long n) {
        double nextGuess = 1;
        for (double lastGuess = 1; lastGuess - nextGuess <= 0; lastGuess++) {
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
    }
}
