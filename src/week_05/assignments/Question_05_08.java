package week_05.assignments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter each student's name and score ");
        String s1 = input.next();
        int score1 = input.nextInt();
        System.out.printf("Student: 1\n\tName: %s\n\tScore: %d", s1, score1);
        String s2 = input.next();
        int score2 = input.nextInt();
        System.out.printf("\nStudent: 2\n\tName: %s\n\tScore: %d", s2, score2);
        String s3 = input.next();
        int score3 = input.nextInt();
        System.out.printf("\nStudent: 3\n\tName: %s\n\tScore: %d", s3, score3);

        String s11 = s1 + score1;
        String s22 = s2 + score2;
        String s33 = s3 + score3;

        int temp = Math.max(score1, score2);
        int max = Math.max(temp, score3);
        String maxs = max + "";

        if (s11.contains(maxs)) {
            System.out.printf("\nStudent with the highest score: %s", s1);
        }
        if (s22.contains(maxs)) {

            System.out.printf("\nStudent with the highest score: %s", s2);
        }
        if (s33.contains(maxs)) {
            System.out.printf("\nStudent with the highest score: %s", s3);
        }


    }
}
