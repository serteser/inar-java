package week_07.assignments;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        selectionSort(numbers);
    }

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            double currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
