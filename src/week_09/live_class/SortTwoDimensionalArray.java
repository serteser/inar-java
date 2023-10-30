package week_09.live_class;

import java.util.Arrays;

public class SortTwoDimensionalArray {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2}, {5,6}, {9, 10}, {3, 4}, {7, 8}, {11, 12}};

        System.out.println(Arrays.deepToString(numbers));
        sort(numbers);
    }

    public static void sort(int[][] m) {
        int[] temp;
        for (int row = 0; row < m.length - 1; row++) {
            int min0 = m[row][0];
            int min1 = m[row][1];
            int minIndex = row;
            for (int j = row + 1; j < m.length; j++) {
                if (min0 > m[j][0] || (min0 == m[j][0] && min1 > m[j][1])) {
                    min0 = m[j][0];
                    min1 = m[j][1];
                    minIndex = j;
                }
            }
            if (minIndex != row) {
                temp = m[row];
                m[row] = m[minIndex];
                m[minIndex] = temp;
            }
        }
        System.out.println(Arrays.deepToString(m));
    }
}
