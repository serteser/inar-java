package week_07.live_class;

import java.util.Arrays;

public class LiveClass3 {
    public static void main(String[] args) {

        //Question : Return a version of the given array where all the 10's have been removed.
        // The remaining elements should shift left towards the start of the array as needed,
        // and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
        // You may modify and return the given array or make a new array.
        int[] array1 = {1, 10, 10, 2} ;
        System.out.println(Arrays.toString(withoutTen(array1)));
        int[] array2 = {10, 2, 10} ;
        System.out.println(Arrays.toString(withoutTen(array2)));
        int[] array3 = {1, 99, 10} ;
        System.out.println(Arrays.toString(withoutTen(array3)));

    }

    public static int[] withoutTen(int[] array) {
        int[] result = new int[array.length];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                continue;
            }
            else {
                result[count] =  array[i];
                count++;
            }
        }
        return result;
    }

}
