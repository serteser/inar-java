package week_07.assignments;

public class Question_07_16 {
    public static void main(String[] args) {

        // Create an array
        int[] arrayOfRandomNumbers = new int[100000];

        // Initialize the array with random numbers
        int key = (int) (Math.random() * 1000);
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            arrayOfRandomNumbers[i] = (int) (Math.random() * 1000);
        }

        // Perform the task by linear search
        long startTimeForLinear = System.currentTimeMillis();
        int index = 0;
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] == key) {
                index = i;
                break;
            }
        }
        long endTimeForLinear = System.currentTimeMillis();
        long executionTimeForLinear = endTimeForLinear - startTimeForLinear;
        System.out.println("Execution time of invoking the linearSearch in milliseconds: " + executionTimeForLinear);
        System.out.println();

        // Before the search starts, numbers needed to be sorted for binary search
        int[] arrayOfSortedNumbers = sortedArray(arrayOfRandomNumbers);
        // Perform the task by binary search
        long startTimeForBinary = System.currentTimeMillis();
        int indexOfBinary = 0;
        int low = 0;
        int high = arrayOfSortedNumbers.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < arrayOfSortedNumbers[mid]) {
                high = mid - 1;
            } else if (key == arrayOfSortedNumbers[mid]) {
                indexOfBinary = mid;
                break;
            } else {
                low = mid + 1;
            }
        }
        indexOfBinary = -low - 1;


        long endTimeForBinary = System.currentTimeMillis();
        long executionTimeForBinary = endTimeForBinary - startTimeForBinary;
        System.out.print("Execution time of invoking the binarySearch in milliseconds: " + executionTimeForBinary);

    }

    public static int[] sortedArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
        return array;
    }

}
