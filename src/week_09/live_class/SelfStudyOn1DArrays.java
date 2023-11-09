package week_09.live_class;

import java.util.Scanner;

public class SelfStudyOn1DArrays {
    public static void main(String[] args) {

        int[] tenNumbers = getArray();
        int countOfDistinctNumber = countOfDistinctNumber(tenNumbers);
        System.out.println("The number of distinct numbers is " + countOfDistinctNumber);
        printArray(distinctNumbers(tenNumbers));


    }

    public static int[] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("The distinct numbers are ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int countOfDistinctNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDistinct = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isDistinct = false;
                }
            }
            if (isDistinct) {
                count++;
            }
        }
        return count;
    }

    public static boolean isUnique(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return false;
            }
        }
        return true;
    }

    public static int[] distinctNumbers(int[] array) {
        int[] result = new int[countOfDistinctNumber(array)];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (isUnique(result, array[i])) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
}
