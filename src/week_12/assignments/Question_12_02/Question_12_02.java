package week_12.assignments.Question_12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers to sum: ");

        boolean isCompleted = true;
        do {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                int sum = number1 + number2;
                System.out.printf("Sum of %d + %d is %d", number1, number2, sum);
                isCompleted = false;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input !! Please enter integer --> ");
                input.nextLine();
            }


        } while (isCompleted);
    }
}
