package week_08.live_class;

import java.util.Arrays;

public class MatrixSortCustom {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 2, 9, 1},
                {8, 4, 7, 3},
                {6, 0, 5, 2}
        };

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Flatten the matrix into a 1D array
        int[] flatArray = new int[numRows * numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                flatArray[i * numCols + j] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(flatArray));
        // Sort the 1D array
        Arrays.sort(flatArray);

        // Reshape the sorted 1D array into a matrix
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = flatArray[i * numCols + j];
            }
        }

        // Print the sorted matrix
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
