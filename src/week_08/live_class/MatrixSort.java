package week_08.live_class;

import java.util.Arrays;

public class MatrixSort {

        public static void main(String[] args) {
            int[][] matrix = {
                    {5, 2, 9, 1},
                    {8, 4, 7, 3},
                    {6, 0, 5, 2}
            };

            // Sort each row of the matrix
            for (int i = 0; i < matrix.length; i++) {
                Arrays.sort(matrix[i]);
            }

            // Print the sorted matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

}
