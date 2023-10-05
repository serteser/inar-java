package week_07.assignments;

import java.util.Scanner;

public class Question_07_09 {
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

        // Displaying the minimum number in the array
        System.out.printf("The minimum number is: %.1f", min(doubleNumbers));
    }

    // A method that finds the smallest element in an array
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
