package week_07.assignments;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        // Create an array
        int[] numbers = new int[10];

        // Initialize the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Make the array reverse by using a method and assign it to another array
        int[] reverseArray = reverse(numbers);

        // Display the result
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + " ");
        }
    }

    public static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[(array.length - 1) - i];
        }
        return reverseArray;
    }
}
