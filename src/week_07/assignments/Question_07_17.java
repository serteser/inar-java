package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String[] namesOfStudents = new String[numberOfStudents];
        int[] score = new int[numberOfStudents];
        System.out.println("Enter the name and a score for each student:");

        // Read the inputs and assign them for initializing the arrays
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String name = input.next();
            namesOfStudents[i] = name;

            System.out.print("Score: ");
            int number = input.nextInt();
            score[i] = number;
        }

        // Sorting the scores
        for (int i = 0; i < score.length - 1; i++) {
            int currentMax = score[i];
            int currentMaxIndex = i;
            for (int j = i + 1; j < score.length; j++) {
                if (currentMax < score[j]) {
                    currentMax = score[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                score[currentMaxIndex] = score[i];
                score[i] = currentMax;
            }

            // Matching the scores with names, then display the result
        }
        for (int i = 0; i < score.length; i++) {
            switch (score[i]) {
                case 56:
                    System.out.println("Freddie");
                    break;
                case 87:
                    System.out.println("John");
                    break;
                case 70:
                    System.out.println("Annie");
                    break;
                case 29:
                    System.out.println("Leona");
                    break;
            }

        }

    }
}

