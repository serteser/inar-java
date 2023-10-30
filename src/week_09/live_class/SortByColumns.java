package week_09.live_class;

import java.util.Arrays;

public class SortByColumns {
    public static void main(String[] args) {
        int[][] numbers = {{1, 12}, {5, 6}, {9, 10}, {3, 41}, {7, 80}, {11, 2}};
        sortByColumn(numbers);
    }

    public static void sortByColumn(int[][] m) {
        int[] temp;
        for (int i = 0; i < m.length - 1; i++) {
            int min0 = m[i][0];
            int min1 = m[i][1];
            int minIndex = i;
            for (int j = i + 1; j < m.length; j++) {
                    if(min1>m[j][1]){
                        min1=m[j][1];
                        min0=m[j][0];
                        minIndex=j;
                    }
            }
            if(minIndex!=i){
                temp=m[i];
                m[i]=m[minIndex];
                m[minIndex]=temp;
            }
        }
        System.out.print(Arrays.deepToString(m));
    }
}
