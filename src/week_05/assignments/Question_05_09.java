package week_05.assignments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        // Reading inputs
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

        // Assigning to strings
        String s11 = s1 + score1;
        String s22 = s2 + score2;
        String s33 = s3 + score3;

        // Finding the maximum score and assigning as a string
        int tempMax = Math.max(score1, score2);
        int max = Math.max(tempMax, score3);
        String maximumScore = max + "";

        // Displaying The highest scoring student
        System.out.print("\nThe highest scoring student: ");
        if (s11.contains(maximumScore)) {
            System.out.printf(s1);
        }
        if (s22.contains(maximumScore)) {
            System.out.printf(s2);
        }
        if (s33.contains(maximumScore)) {
            System.out.printf(s3);
        }
        // Finding the minimum score
        int tempMin = Math.min(score1, score2);
        int min = Math.min(tempMin, score3);

        // Then finding the middle score and assigning as a string
        int mid = 0;
        if (score1 != max && score1 != min) {
            mid = score1;
        } else if (score2 != max && score2 != min) {
            mid = score2;
        } else {
            mid = score3;
        }
        String midScore = mid + "";

        // Displaying the second-highest scoring student
        System.out.print("\nThe second highest scoring student: ");
        if (s11.contains(midScore)) {
            System.out.printf(s1);
        }
        if (s22.contains(midScore)) {
            System.out.printf(s2);
        }
        if (s33.contains(midScore)) {
            System.out.printf(s3);
        }


    }
}
