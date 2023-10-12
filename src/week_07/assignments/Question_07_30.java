package week_07.assignments;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();
        System.out.print("Enter the values: ");
        int[] list = new int[numberOfValues];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.printf(isConsecutiveFour(list) ? "The list has consecutive fours" : "The list has no consecutive fours");

    }

    public static boolean isConsecutiveFour(int[] array) {
        if (array.length < 4) {
            return false;
        }
        int countOfConsecutive = 0;
        int previous = array[0];
        for (int i = 1; i < array.length; i++) {
            if (previous == array[i]) {
                countOfConsecutive++;
                if (countOfConsecutive == 3) {
                    return true;
                }
            } else {
                previous = array[i];
                countOfConsecutive = 0;
            }
        }
        return false;
    }
}
