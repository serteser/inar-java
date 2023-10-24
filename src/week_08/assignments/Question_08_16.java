package week_08.assignments;

public class Question_08_16 {
    public static void main(String[] args) {

        int[][] matrix = {
                {4, 2},
                {1, 7},
                {4, 5},
                {1, 2},
                {1, 1},
                {4, 1}
        };
        sortRow(matrix);
        printMatrix(matrix);
    }

    public static void sortRow(int[][] m) {
        int[] temp;
        for (int row = 0; row < m.length - 1; row++) {
            int min0 = m[row][0];
            int min1 = m[row][1];
            int minIndex = row;

            for (int i = row + 1; i < m.length; i++) {
                if (min0 > m[i][0] || min0 == m[i][0] && min1 > m[i][1]) {
                    min0 = m[i][0];
                    min1 = m[i][1];
                    minIndex = i;
                }
            }
            if (minIndex != row) {
                temp = m[row];
                m[row] = m[minIndex];
                m[minIndex] = temp;
            }
        }
    }

    public static void printMatrix(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.print("");
        }
    }
}
