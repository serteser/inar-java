package week_07.assignments;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int[] hundredNumbers = new int[100];
        int data = input.nextInt();

        while (data != 0) {
            hundredNumbers[data]++;
            data = input.nextInt();
        }

        for (int i = 0; i < hundredNumbers.length; i++) {
            if (hundredNumbers[i] > 1) {
                System.out.println(i + " occurs " + hundredNumbers[i] + " times");
            } else if (hundredNumbers[i] == 1) {
                System.out.println(i + " occurs " + hundredNumbers[i] + " time");
            }
        }
    }
}
