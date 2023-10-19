package week_08.live_class;

public class SomeArrayMethods {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        printMatrix(matrix);
    }
    public static void printMatrix(double[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.printf("%3f ",matrix[row][column]);
            }
            System.out.println();
        }
    }
}
