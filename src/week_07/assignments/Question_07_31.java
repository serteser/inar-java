package week_07.assignments;

import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create and initialize first array
        System.out.print("Enter list1: ");
        int lengthOfList1 = input.nextInt();
        int[] list1 = new int[lengthOfList1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        // Create and initialize second array
        System.out.print("Enter list2: ");
        int lengthOfList2 = input.nextInt();
        int[] list2 = new int[lengthOfList2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        // Display the result
        int[] mergedList = (merged(list1, list2));
        System.out.print("The merged list is ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }

    public static int[] merged(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int k = 0;
        for (int i = 0; i < mergedList.length; i++) {
            mergedList[i] = list1[i];
            if (i == list1.length - 1) {
                for (int j = i + 1; j < mergedList.length; j++, k++) {
                    mergedList[j] = list2[k];
                }
                break;
            }
        }
        for (int i = 0; i < mergedList.length; i++) {
            int currentMin = mergedList[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < mergedList.length; j++) {
                if (currentMin > mergedList[j]) {
                    currentMin = mergedList[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                mergedList[currentMinIndex] = mergedList[i];
                mergedList[i] = currentMin;
            }
        }
        return mergedList;
    }
}
