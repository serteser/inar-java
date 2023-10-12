package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int lengthOfList1 = input.nextInt();
        int[] list1 = new int[lengthOfList1];
        for (int i = 0; i < lengthOfList1; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int lengthOfList2 = input.nextInt();
        int[] list2 = new int[lengthOfList2];
        for (int i = 0; i < lengthOfList2; i++) {
            list2[i] = input.nextInt();
        }

        System.out.print(equals(list1, list2) ? "Two lists are identical" : "Two lists are not identical");

    }

    public static boolean equals(int[] list1, int[] list2) {

        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                Arrays.sort(list1);
                Arrays.sort(list2);
            }
        }
        if (Arrays.equals(list1, list2)) {
            return true;
        } else {
            return false;
        }

    }
}
