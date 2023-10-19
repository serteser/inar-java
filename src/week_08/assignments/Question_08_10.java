package week_08.assignments;

public class Question_08_10 {
    public static void main(String[] args) {

        // Create a matrix
        int[][] binary = new int[4][4];

        // Initialize the matrix
        getRandomMatrix(binary);

        // Display the matrix
        printMatrix(binary);

        // Perform the tasks and display the result
        System.out.printf("The (first) largest row index: %d\n" +
                "The (first) largest column index: %d", findIndexOfLargestRow(binary), findIndexOfLargestColumn(binary));
    }

    public static int[][] getRandomMatrix(int[][] m) {

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = (int) (Math.random() * 2);
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

    public static int findIndexOfLargestRow(int[][] m) {
        int[] s = new int[m.length];
        for (int row = 0; row < m.length; row++) {
            int total = 0;
            for (int column = 0; column < m[0].length; column++) {
                total += m[row][column];
            }
            s[row] = total;
        }
        int max = s[0];
        int indexOfMax = 0;
        for (int i = 1; i < s.length; i++) {
            if (max < s[i]) {
                max = s[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public static int findIndexOfLargestColumn(int[][] m) {
        int[] s = new int[m[0].length];
        for (int column = 0; column < m[0].length; column++) {
            int total = 0;
            for (int row = 0; row < m.length; row++) {
                total += m[row][column];
            }
            s[column] = total;
        }
        int max = s[0];
        int indexOfMax = 0;
        for (int i = 1; i < s.length; i++) {
            if (max < s[i]) {
                max = s[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
