package week_02.assignments;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000 :");
        int number = input.nextInt();
        int frst_digit = number % 10;
        int sub_number1 = (number - frst_digit) / 10;
        int scnd_digit = sub_number1 % 10;
        int sub_number2 = (sub_number1 - scnd_digit);
        int thrd_digit = sub_number2 / 10;
        int sum = frst_digit + scnd_digit + thrd_digit;
        System.out.println("The sum of the digits is " + sum);
    }
}