package week_07.assignments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.printf("The mean is %.2f\n", mean(numbers));
        System.out.printf("The standard deviation is %.5f", deviation(numbers));
    }

    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double deviation(double[] array) {
        double mean = mean(array);
        double sum = 0;
        double deviation = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow((array[i] - mean), 2);
            deviation = Math.sqrt(sum / (array.length - 1));
        }
        return deviation;
    }
}
