package week_07.assignments;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten values of double type: ");

        // Reading, creating and initializing array with double elements
        double readDoubleInput;
        double[] doubleNumbers = new double[10];
        for (int i = 0; i < doubleNumbers.length; i++) {
            readDoubleInput = input.nextDouble();
            doubleNumbers[i] = readDoubleInput;
        }

        // Displaying the result
        System.out.printf("The average value: %.15f", average(doubleNumbers));

    }

    public static int average(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum / array.length;
    }
}
