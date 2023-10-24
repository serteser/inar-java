package week_08.assignments;

public class Question_08_22 {
    public static void main(String[] args) {

        // Get the input and create a matrix
        int[][] binaryMatrix = getAMatrix();

        // Display the matrix
        printMatrix(binaryMatrix);

        // Control the columns and rows then display the result
        controlOfRows(binaryMatrix);
        controlOfColumns(binaryMatrix);
    }

    public static int[][] getAMatrix() {
        int[][] m = new int[6][6];
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

    public static void controlOfRows(int[][] m) {
        int detector = 0;
        for (int row = 0; row < m.length; row++) {
            int total = 0;
            for (int column = 0; column < m[0].length; column++) {
                total += m[row][column];
            }
            if (total % 2 != 0) {
                System.out.println("Every row does not have an even number of 1s");
                detector++;
                break;
            }
        }
        if (detector == 0) {
            System.out.println("Every row have an even number of 1s");
        }
    }

    public static void controlOfColumns(int[][] m) {
        int detector = 0;
        for (int column = 0; column < m[0].length; column++) {
            int total = 0;
            for (int row = 0; row < m.length; row++) {
                total += m[row][column];
            }
            if (total % 2 != 0) {
                System.out.println("Every column does not have an even number of 1s");
                detector++;
                break;
            }
        }
        if (detector == 0) {
            System.out.println("Every column have an even number of 1s");
        }
    }
}
