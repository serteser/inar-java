package week_07.assignments;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores: (negative number signifies end): ");

        // Create and initialize the array
        int scores = input.nextInt();
        int[] arrayOfScores = new int[101];
        for (int i = 0; i < arrayOfScores.length; i++) {
            arrayOfScores[i] = i;
        }
        // Create a copy array
        int[] copyArrayOfScores = new int[arrayOfScores.length];

        // Initialize it by copying the previous array
        System.arraycopy(arrayOfScores, 0, copyArrayOfScores, 0, arrayOfScores.length);

        // Reading and processing them within the copying array and calculate the sum and also find the average
        int sum = 0;
        double k = 0;
        while (scores >= 0) {
            sum += scores;
            copyArrayOfScores[scores]++;
            scores = input.nextInt();
            k++;
        }
        double average = sum / k;

        // Separation of scores according to the average
        int aboveOrEqualAverage = 0;
        int belowAverage = 0;
        for (int i = 0; i < arrayOfScores.length; i++) {
            if (arrayOfScores[i] != copyArrayOfScores[i]) {
                if (arrayOfScores[i] >= average) {
                    aboveOrEqualAverage += copyArrayOfScores[i] - arrayOfScores[i];
                } else {
                    belowAverage += copyArrayOfScores[i] - arrayOfScores[i];
                }
            }
        }

        // Displaying the results
        System.out.printf("\nThe average of scores: %.0f\n", average);
        System.out.printf("Number of scores above or equal to average: %d\n", aboveOrEqualAverage);
        System.out.printf("Number of scores below average: %d", belowAverage);

    }
}
