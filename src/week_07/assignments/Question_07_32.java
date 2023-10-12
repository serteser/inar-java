package week_07.assignments;

import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int lengthOfList = input.nextInt();
        int[] list = new int[lengthOfList];
        for (int i = 0; i < lengthOfList; i++) {
            list[i] = input.nextInt();
        }
        int[] listAfterPartition = partition(list);
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < listAfterPartition.length; i++) {
            System.out.print(listAfterPartition[i] +" ");
        }
    }

    public static int[] partition(int[] array) {
        int[] afterPartition = new int[array.length];
        int pivot = 0;
        int indexOfPivot = 0;
        int indexOfSmallerPivot = 0;
        int indexOfGreaterPivot = array.length - 1;
        for (int i = 1; i < array.length; i++) {
            pivot = array[0];
            if (array[i] < pivot) {
                afterPartition[indexOfSmallerPivot] = array[i];
                indexOfSmallerPivot++;
                indexOfPivot++;
            } else {
                afterPartition[indexOfGreaterPivot] = array[i];
                indexOfGreaterPivot--;

            }
        }
        afterPartition[indexOfPivot] = pivot;
        return afterPartition;
    }
}
