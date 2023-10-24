package week_08.live_class;

import java.util.Arrays;

public class FlattenedMatrix {
    public static void main(String[] args) {

        int[][] matrix = getRandomMatrix();
        printMatrix(matrix);

        int[] flatMatrix = flattenedMatrix(matrix);
        System.out.println(Arrays.toString(flatMatrix));

        sortFlattenedMatrix(flatMatrix);
        System.out.println(Arrays.toString(flatMatrix));

        int[][] sortedMatrix = arrayToMatrix(flatMatrix);
        printMatrix(sortedMatrix);



    }

    public static int[][] getRandomMatrix() {
        int[][] m = new int[5][4];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = (int) (50 + Math.random() * 50);
            }
        }
        return m;
    }

    public static void printMatrix(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int[] flattenedMatrix(int[][] m) {
        int i = m.length;
        int j = m[0].length;
        int[] f = new int[i * j];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                f[row * j + column] = m[row][column];
            }
        }
        return f;
    }

    public static int[] sortFlattenedMatrix(int[] f) {
        for (int i = 0; i < f.length - 1; i++) {
            int currentMin = f[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < f.length; j++) {
                if (currentMin > f[j]) {
                    currentMin = f[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                f[currentMinIndex] = f[i];
                f[i] = currentMin;
            }
        }
        return f;
    }

    public static int[][] arrayToMatrix(int[] f) {
        int[][] m = new int[5][4];
        int row = 0;
        int column = 0;
        for (int i = 0; i < f.length; i++) {
            m[row][column] = f[i];
            if ((i+1)%4 == 0) {
                row++;
                column = -1;
            }
            column++;
        }
        return m;
    }
}
