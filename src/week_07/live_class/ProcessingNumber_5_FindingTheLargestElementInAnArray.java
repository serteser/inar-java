package week_07.live_class;

import java.util.Scanner;

public class ProcessingNumber_5_FindingTheLargestElementInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] score = new int[5];
        score[0] = input.nextInt();
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            score[i] = input.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println(max);
    }
}
