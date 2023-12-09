package week_14.live_class;

import java.util.ArrayList;
import java.util.Collection;

public class BinarySearchTest {
    public static void main(String[] args) {

        int[] array = {3, 8, 10, 21, 30, 45, 60, 70};
        int[] array1 = {3};
        System.out.printf("Searching result for key 21 is index %d \n", binarySearch(array, 21));
        System.out.printf("Searching result for key 3 is index %d ", binarySearch(array1, 3));
    }

    public static int binarySearch(int[] a, int key) {

        int low = 0;
        int high = a.length - 1;

        while (high >= low) {

            int mid = (high + low) / 2;

            if (key < a[mid]) {
                high = mid - 1;
            }

            else if (key == a[mid]) {
                return mid;
            }

            else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
