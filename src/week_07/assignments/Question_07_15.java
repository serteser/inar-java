package week_07.assignments;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.print("The distinct numbers are: ");
        int[] eliminateNumbers = eliminateDuplicate(numbers);

        for (int number : eliminateNumbers) {
            System.out.print(number + " ");
        }
    }

    public static int[] eliminateDuplicate(int[] list) {
        int[] listWithDefaultValues = new int[list.length];
        String allNumbers = " ";
        String newNumber;
        int lengthOfEliminateList = 0;
        for (int i = 0; i < list.length; i++) {
            newNumber = "" + list[i];
            if (!allNumbers.contains(newNumber)) {
                allNumbers += " " + newNumber;
                lengthOfEliminateList++;
                listWithDefaultValues[i] = list[i];
            }
        }
        int[] eliminateDuplicate = new int[lengthOfEliminateList];
        for (int i = 0, k = 0; i < listWithDefaultValues.length ^ k == lengthOfEliminateList; i++, k++) {
            if (listWithDefaultValues[i] != 0) {
                eliminateDuplicate[k] = listWithDefaultValues[i];
            } else if (listWithDefaultValues[i] == 0) {
                do {
                    i++;
                } while (listWithDefaultValues[i] == 0);
                eliminateDuplicate[k] = listWithDefaultValues[i];
            }
        }
        return eliminateDuplicate;
    }
}
