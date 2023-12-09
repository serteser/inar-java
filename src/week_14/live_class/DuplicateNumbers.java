package week_14.live_class;

import java.util.Arrays;

public class DuplicateNumbers {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 5, 7, 9, 2};
        int[] array2 = {1, 80, 7, 6, 2};

        int length = Math.max(array1.length, array2.length);
        int[] temp = new int[length];

        int index = 0;
        if (length == array1.length) {
            for (int i = 0; i < length; i++) {

                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        temp[index]= array1[i];
                        index++;
                    }
                }

            }
        } else {
            for (int i = 0; i < length; i++) {

                for (int j = 0; j < array1.length; j++) {
                    if (array2[i] == array1[j]) {
                        temp[index]= array2[i];
                        index++;
                    }
                }

            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i]=temp[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
