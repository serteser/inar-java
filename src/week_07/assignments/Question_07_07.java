package week_07.assignments;

public class Question_07_07 {
    public static void main(String[] args) {

        // Create arrays
        int[] randomNumbers = new int[100];
        int[] counts = new int[10];

        // Inıtialized them
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < counts.length; i++) {
            counts[i] = i;
        }

        // Count repeated occurrences of numbers
        for (int randomNumber : randomNumbers) {
            counts[randomNumber]++;
        }

        // Display the result
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%ds: %d \n", i, counts[i] - i);
        }
    }
}
