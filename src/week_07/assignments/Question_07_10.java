package week_07.assignments;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        // Reading, creating and initializing the array
        double readInput;
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            readInput = input.nextDouble();
            numbers[i] = readInput;
        }

        // Displaying the minimum number and the index of smallest of that number
        System.out.printf("The minimum number is: %.1f index %d", min(numbers), indexOfSmallest(numbers));
    }

    public static int indexOfSmallest(double[] array) {
        double min = array[0];
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

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
