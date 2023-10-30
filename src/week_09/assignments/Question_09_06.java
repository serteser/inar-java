package week_09.assignments;

public class Question_09_06 {
    public static void main(String[] args) {

        int[] numbers = new int[100_000];
        initializeArray(numbers);
        StopWatch watch = new StopWatch();
        watch.start();
        sortingArray(numbers);
        watch.stop();
        System.out.println("\nThe execution time of sorting 100,000 numbers using selection sort: " + watch.getElapsedTime() + " milliseconds");
    }

    public static void initializeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100000);
        }
    }

    public static void sortingArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int currentMin = a[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (currentMin > a[j]) {
                    currentMin = a[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                a[currentMinIndex] = a[i];
                a[i] = currentMin;
            }
        }
    }
}
