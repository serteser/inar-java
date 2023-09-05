package week_05.assignments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        String output = "";
        int correctCount = 0;

        for (int questionCount = 1; questionCount < 11; questionCount++) {
            int number1 = 1 + (int) (Math.random() * (16 - 1));
            int number2 = 1 + (int) (Math.random() * (16 - 1));
            System.out.printf("What is %d + %d? ", number1, number2);
            int answer = input.nextInt();

            if (answer == number1 + number2) {
                System.out.println("You are correct!");
                correctCount++;
            } else if (answer != number1 + number2) {
                System.out.printf("Your answer is wrong.\n%d + %d should be %d\n", number1, number2, (number1 + number2));
            }

            output += "\n" + number1 + "+" + number2 + "=" + answer + ((number1 + number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = ((endTime - startTime) / 1000) % 60;
        System.out.printf("\n\nCorrect count is %d\nTest time is %d seconds\n\n%s", correctCount, testTime, output);

    }
}
