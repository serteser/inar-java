package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int lengthOfList = input.nextInt();
        int[] list = new int[lengthOfList];
        for (int i = 0; i < lengthOfList; i++) {
            list[i] = input.nextInt();
        }

        System.out.println(isSorted(list) ? "The list is already sorted" : "The list is not sorted");

    }

    public static boolean isSorted(int[] list) {

        // Copy the initial array to compare themselves afterward with the sorted version
        int[] copyList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            copyList[i] = list[i];
        }

        // Make the array sorted
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;

            }
        }

        // Compare the arrays
        return Arrays.equals(copyList, list);
    }
}
