package week_07.assignments;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores (negative number signifies end) : ");
        int[] scores = new int[100];
        int data = input.nextInt();
        int total = 0;
        int countOfScores = 0;

        while (data != -1) {

            scores[data]++;
            total += data;
            countOfScores++;
            data = input.nextInt();
        }
        int average = total / countOfScores;

        int below = 0;
        int above = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < 15) {
                below += scores[i];
            } else if (i >= 15) {
                above += scores[i];
            }
        }
        System.out.printf("Average of scores : %d\nNumber of scores above or equal to average: %d\nNumber of scores below average: %d", average, above, below);

    }
}
