package week_07.assignments;

import java.util.Scanner;


public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int data = input.nextInt();

        int[] array = new int[99];
        for (int j = 1; j < array.length; j++) {
            array[j] = j;
        }

        int[] arrayCopy = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }

        while (data != 0) {
            arrayCopy[data]++;
            data = input.nextInt();

        }

        for (int j = 1; j < arrayCopy.length; j++) {
            if (arrayCopy[j] != array[j]) {
                System.out.printf("%d occurs %d %s\n", array[j], (arrayCopy[j] - array[j]), ((arrayCopy[j] - array[j]) > 1) ? "times" : "time");
            }

        }

    }
}
