package week_08.live_class;

import java.util.Scanner;

public class PyramidWithPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the stair number of the pyramid (between 1 and 10): ");
        int stairs = input.nextInt();
        displayPyramid(stairs);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayPyramid(int stairs) {
        int numbersOnEachStair;
        int count;
        int lastPrime = 2;
        for (int i = 1; i <= stairs; i++) {
            for (int j = i - 1; j < stairs - 1; j++) {
                System.out.print("     ");
            }
            count = 0;
            numbersOnEachStair = i * 2 - 1;
            for (int j = lastPrime; j < 1000; j++) {
                if (isPrime(j)) {
                    System.out.printf("%5d", j);
                    lastPrime = j + 1;
                    count++;
                }
                if (count == numbersOnEachStair) {
                    break;
                }
            }
            System.out.println();

        }
    }
}
