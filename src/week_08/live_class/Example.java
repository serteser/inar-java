package week_08.live_class;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        int[][] multiArray = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 2, 3},
                {7, 5, 6},
        };
        int[] flattened = flattenedMatrix(multiArray);
        System.out.println(Arrays.toString(flattened));
        int[] result = createArray(flattened);
        System.out.println(Arrays.toString(result));
    }

    public static int[] flattenedMatrix(int[][] m) {
        int[] flattenedArray = new int[m.length * m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                flattenedArray[i * m[0].length + j] = m[i][j];
            }
        }
        return flattenedArray;
    }

    public static int countOfRepetitionElements(int[] f) {
        int count = 0;
        for (int i = 0; i < f.length; i++) {
            for (int j = i + 1; j < f.length; j++) {
                if (f[i] == f[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isUnique(int number, int[] f) {
        for (int i = 0; i < f.length; i++) {
            if (f[i] == number) {
                return false;
            }
        }
        return true;
    }

    public static int[] createArray(int[] f) {
        int[] result = new int[f.length - countOfRepetitionElements(f)];
        int count = 0;
        for (int i = 0; i < f.length; i++) {
            if (isUnique(f[i], result)) {
                result[count] = f[i];
                count++;
            }
        }
        return result;
    }
}


