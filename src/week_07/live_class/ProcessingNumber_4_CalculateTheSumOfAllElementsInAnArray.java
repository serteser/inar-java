package week_07.live_class;

import java.util.Scanner;

public class ProcessingNumber_4_CalculateTheSumOfAllElementsInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the count of numbers that you want to sum: ");
        int countOfNumbers = input.nextInt();
        double[] numbers = new double[countOfNumbers];
        System.out.print("Enter the numbers: ");
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
