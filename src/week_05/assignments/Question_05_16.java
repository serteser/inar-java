package week_05.assignments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int divisor = 2;
        String factors = "";

        while (divisor <= number) {
            while (number % divisor == 0) {

                number /= divisor;
                factors += ", " + divisor;
            }

            divisor++;
        }
        String withoutComma = factors.substring(1);
        System.out.println(withoutComma.trim() + ".");
    }
}
