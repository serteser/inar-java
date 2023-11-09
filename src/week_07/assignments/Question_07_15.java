package week_07.assignments;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {

        int[] listOfTen = getArray();
        int[] distinctNumbers = eliminateDuplicates(listOfTen);
        System.out.print("The distinct numbers are: ");
        printResult(distinctNumbers);
    }

    public static int[] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        return a;
    }
    public static void printResult(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static boolean isUnique(int[] a, int number) {
        for (int i = 0; i < a.length; i++) {
            if (number == a[i]) {
                return false;
            }
        }
        return true;
    }
    public static int lengthWithoutDuplicateNumbers(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                }
            }
            if(!isDuplicate){
                count++;
            }
        }
        return count;
    }
    public static int[] eliminateDuplicates(int[] a) {
        int distinctNumbers = lengthWithoutDuplicateNumbers(a);
        int[] afterEliminate = new int[distinctNumbers];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (isUnique(afterEliminate, a[i])) {
                afterEliminate[index] = a[i];
                index++;
            }
        }
        return afterEliminate;
    }


}
