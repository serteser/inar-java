package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        // Declaring a variable for reading the input**
        int inputNumbers;

        // Create an array
        int[] numbers = new int[10];

        // Initialize the array by reading input and controlled each one by "contains" method
        int counter = 0;
        String sum = " ";
        for (int i = 0; i < numbers.length; i++) {
            inputNumbers = input.nextInt();
            String s = inputNumbers + " ";
            if (!sum.contains(s)) {
                numbers[i] = inputNumbers;
                sum += inputNumbers + " ";
                counter++;
            }
        }

        // Display the result
        System.out.printf("The number of distinct numbers is %d", counter);
        System.out.print("\nThe number of distinct numbers are ");
        for (int number : numbers) {
            if (number != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
