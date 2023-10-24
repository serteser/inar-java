package week_08.assignments;

public class Question_08_18 {
    public static void main(String[] args) {

        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        displayMatrix(m);
    }

    public static void shuffleMatrix(int[][] m) {
        int[] temp;
        for (int i = m.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));

            temp = m[i];
            m[i] = m[index];
            m[index] = temp;
        }
    }

    public static void displayMatrix(int[][] m) {
        shuffleMatrix(m);
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.println();
        }
    }

}
