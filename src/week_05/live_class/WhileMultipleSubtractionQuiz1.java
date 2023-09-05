package week_05.live_class;

import java.util.Scanner;

public class WhileMultipleSubtractionQuiz1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int right = 1;
        int wrong = 1;
        String output;
        long startTime = System.currentTimeMillis() / 1000;
        long endOfPracticingInSeconds = System.currentTimeMillis() / 1000;

        while (counter < 6) {
            int number1 = (int) (Math.random() * 101);
            int number2 = (int) (Math.random() * 101);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.printf("\nPlease enter your answer for the algebraic subtraction operation which is shown below : \n\t\t\t\t\tWatch out! Your time is ticking out!" +
                    "\n%d) %d - %d = ? ", counter, number1, number2);
            int answer = input.nextInt();
            System.out.println((number1 - number2 == answer) ? "Your answer is right" + right++ : "Your answer is wrong" + wrong++);
            counter++;

        }
        System.out.println("\nYou have completed the quiz. The output of your answers is below.");
        long endTime = System.currentTimeMillis();
        long testTime = ((endTime - startTime) / 1000 % 60);
        System.out.printf("\n%d of the questions are right, \n%d of the questions are wrong, \nbeside your practice time is; %d seconds", right - 1, wrong - 1, testTime);


    }
}
