package week_07.assignments;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers to exclude from random (1-54): ");
        int[] excludingNumbers = new int[10];

        for (int i = 0; i < excludingNumbers.length; i++) {
            excludingNumbers[i] = input.nextInt();
        }
        System.out.printf("Number generated: %d", getRandom(excludingNumbers));
    }

    public static int getRandom(int[] numbers) {
        int countOfGeneratingNumber = 0;
        boolean isTimesUp = false;
        do {
            int number = (int) (1 + Math.random() * (55 - 1));
            countOfGeneratingNumber++;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == number) {
                    --countOfGeneratingNumber;
                    isTimesUp = true;
                    break;
                }
            }
        } while (!isTimesUp);

        return countOfGeneratingNumber;
    }
}
