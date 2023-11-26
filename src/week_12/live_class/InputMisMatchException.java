package week_12.live_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. Incorrect input: an integer is required)");
                input.nextLine(); // DISCARD INPUT
            }
        } while (continueInput);

    }
}
