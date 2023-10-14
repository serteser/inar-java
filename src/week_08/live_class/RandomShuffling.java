package week_08.live_class;

public class RandomShuffling {
    public static void main(String[] args) {

        // Create two-dimensional array
        int[][] matrix = new int[3][3];


        // Initialize the arrays by random values
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
            }
        }

        // Display the indices of columns
        System.out.print("  ");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.printf(" %d", i);
        }
        System.out.println();

        // Display the indices of the rows and the values in the arrays
        for (int row = 0; row < matrix.length; row++) {
            System.out.printf("%d  ", row);
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        // Copy the original array to compare the changes which come to life after the performance of shuffle operation
        int[][] matrixCopy = new int[matrix.length][matrix[0].length];
        System.arraycopy(matrix, 0, matrixCopy, 0, matrix.length);

        // Shuffle the arrays
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {

                // Generate random indices for rows and columns
                int indexRow = (int) (Math.random() * (matrix.length));
                int indexColumn = (int) (Math.random() * (matrix[0].length));

                // Swap the values between themselves
                int temp = matrix[row][column];
                matrix[row][column] = matrix[indexRow][indexColumn];
                matrix[indexRow][indexColumn] = temp;
            }
        }

        // Display the result
        System.out.println();
        for (int row = 0; row < matrixCopy.length; row++) {
            System.out.printf("%d  ", row);
            for (int column = 0; column < matrixCopy[0].length; column++) {
                System.out.print(matrixCopy[row][column] + " ");
            }
            System.out.println();
        }

    }
}
