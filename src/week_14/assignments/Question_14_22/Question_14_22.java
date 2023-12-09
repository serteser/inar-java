package week_14.assignments.Question_14_22;

import java.util.Scanner;

public class Question_14_22 {
    public static void main(String[] args) {

        System.out.print("Enter a positive integer: ");
        int number = new Scanner(System.in).nextInt();

        System.out.print(number + " is " + (isHappy(number) ? "" : "not ") + "a happy number");

    }

    public static boolean isHappy(int number) {

        if (number < 0) {

            System.out.println("Number should not be negative so; ");
            return false;
        } else {

            int count = 0;
            do {
                if (count == 1000) {

                    return false;
                }

                int sum = 0;
                int k = 10;
                do {

                    sum += (int) Math.pow((number % 10), 2);
                    number = number / k;

                    k *= 10;

                } while (number != 0);

                number = sum;
                count++;
            } while (sumOfDigits(number) != 1);
        }
        return true;
    }

    public static int sumOfDigits(int number) {

        int sum = 0;
        int k = 10;
        do {

            sum += (number % k);
            number = number / k;

        } while (number != 0);
        return sum;
    }
}
