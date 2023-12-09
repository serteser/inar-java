package week_14.live_class;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        double[] numbers = {3.1, 2.7, 1.6, 0.5, 1.4, 0.6, 2.3, 0.9, 4.6, 0.1};

        boolean isSorted;

        do {
            isSorted = true;

            for (int i = 1; i < numbers.length; i++) {

                double max = numbers[i - 1];

                if (numbers[i - 1] > numbers[i]) {
                    numbers[i - 1] = numbers[i];
                    numbers[i] = max;
                    isSorted = false;

                }

            }
        } while (!isSorted);


        System.out.println(Arrays.toString(numbers));
    }
}
