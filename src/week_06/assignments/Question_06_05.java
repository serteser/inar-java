package week_06.assignments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Finding max number;
        double tempMax = Math.max(num1, num2);
        double max = Math.max(tempMax, num3);
        // Finding min number ;
        double tempMin = Math.min(num1, num2);
        double min = Math.min(tempMin, num3);
        // Finding middle number and displaying them in increasing order;
        if (num1 != max && num1 != min) {
            System.out.printf("%1.1f %1.1f %1.1f", min, num1, max);
        } else if (num2 != max && num2 != min) {
            System.out.printf("%1.1f %1.1f %1.1f", min, num2, max);
        } else {
            System.out.printf("%1.1f %1.1f %1.1f", min, num3, max);
        }
    }
}
