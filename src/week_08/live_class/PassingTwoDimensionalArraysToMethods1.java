package week_08.live_class;

public class PassingTwoDimensionalArraysToMethods1 {
    public static void main(String[] args) {

        int[][] matrix = getRandomArrayLessThan(3, 4, 50);
        displayArray(matrix);
        int sumOfAllElements = sum(matrix);
        System.out.printf("The sum of all the elements given array is %d", sumOfAllElements);


    }

    public static int[][] getRandomArrayLessThan(int row, int column, int n) {
        int[][] matrix = new int[row][column];
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * n);
            }
        }
        return matrix;
    }

    public static int sum(int[][] array) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                sum += array[row][column];
            }
        }
        return sum;
    }

    public static void displayArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.printf("%3d", matrix[row][column]);
            }
            System.out.println();
        }
    }


}
