package week_07.live_class;

import java.util.Scanner;

public class PracticeOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        //System.out.print("The distinct numbers are: ");
        //int[] eliminateNumbers = eliminateDuplicate(numbers);

        //for (int number : eliminateNumbers) {
        //  System.out.print(number + " ");
        //}

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = 0;

                }

            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] * 2 == 0) {
                count++;
            }
        }
        System.out.print(numbers.length - count);
    }
}
