package week_05.assignments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        double totalNumber = 0;
        int positiveNumber = 0;
        int negativeNumber = 0;
        double average;

        if (number == 0 ) {
            System.out.println("No numbers are entered except 0");
        } else {
            while (number != 0) {

                if (number > 0) {
                    totalNumber += number;
                    positiveNumber++;
                } else {
                    totalNumber += number;
                    negativeNumber++;
                }

                number = input.nextInt();

            }
            average = totalNumber / ((positiveNumber + negativeNumber) * 1.0);
            System.out.printf("The number of positives is %d\nThe number of negatives is %d" +
                    "\nThe total is %.1f\nThe average is %4.2f", positiveNumber, negativeNumber, totalNumber, average);

        }


    }
}
