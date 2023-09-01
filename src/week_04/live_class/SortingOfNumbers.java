package week_04.live_class;

import java.util.Scanner;

public class SortingOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        if (number1 != number2 && number1 != number3 && number2 != number3) {
            if (Math.max(number1, number2) == Math.max(number1, number3)) {
                System.out.println(number1 + " > " + Math.max(number2, number3) + " > " + Math.min(number2, number3));
            } else if (Math.max(number2, number1) == Math.max(number2, number3)) {
                System.out.println(number2 + " > " + Math.max(number1, number3) + " > " + Math.min(number1, number3));
            } else if (Math.max(number3, number1) == Math.max(number3, number2)) {
                System.out.println(number3 + " > " + Math.max(number1, number2) + " > " + Math.min(number1, number2));
            }
        } else {
            System.out.println("invalid input,  numbers must be different from each others ");
        }


    }
}
