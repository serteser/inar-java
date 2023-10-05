package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] score = new int[numberOfStudents];
        System.out.print("Enter " + score.length + " scores: ");
        score[0] = input.nextInt();
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            score[i] = input.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }
        for (int i = 0; i < score.length; i++) {
            System.out.printf("Student %d score is %d and grade is %c\n", i, score[i], getGrade(score[i], max));
        }
    }

    public static char getGrade(int score, int max) {
        if (score >= (max - 10)) {
            return 'A';
        } else if (score >= (max - 20)) {
            return 'B';
        } else if (score >= (max - 30)) {
            return 'C';
        } else if (score >= (max - 40)) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
