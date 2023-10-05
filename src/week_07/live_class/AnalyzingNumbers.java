package week_07.live_class;

import java.util.Scanner;

public class AnalyzingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }
        System.out.printf("The average is %.2f\n", average);
        System.out.printf("Number of elements above the average is %d", count);
    }
}
