package week_07.assignments;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] doubleNumbers = new double[10];
        for (int i = 0; i < doubleNumbers.length; i++) {
            doubleNumbers[i] = input.nextDouble();
        }
        bubbleSort(doubleNumbers);

    }

    public static void bubbleSort(double[] array) {
        boolean isSorted = true;
        while (isSorted) {
            int count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                double currentMin = array[i];
                int currentMinIndex = i;
                if (currentMin > array[i + 1]) {
                    array[currentMinIndex] = array[i + 1];
                    array[i + 1] = currentMin;
                    count++;
                }
            }
            if (count == 0) {
                isSorted = false;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
