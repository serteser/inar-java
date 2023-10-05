package week_07.assignments;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = input.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
}
