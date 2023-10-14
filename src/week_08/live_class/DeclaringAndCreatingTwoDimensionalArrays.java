package week_08.live_class;

import java.util.Arrays;
import java.util.Scanner;

public class DeclaringAndCreatingTwoDimensionalArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matrixByUser = new int[2][2];
//        System.out.printf("Enter %d rows and %d columns\n", matrixByUser.length, matrixByUser[0].length);
//        for (int row = 0; row < matrixByUser.length; row++) {
//            for (int column = 0; column < matrixByUser[0].length; column++) {
//                matrixByUser[row][column] = input.nextInt();
//            }
//        }
        for (int row = 0; row < matrixByUser.length; row++) {
            for (int column = 0; column < matrixByUser[0].length; column++) {
                matrixByUser[row][column] = (int) (Math.random() * 10);
            }
        }
        for (int row = 0; row < matrixByUser.length; row++) {
            for (int column = 0; column < matrixByUser[0].length; column++) {
                System.out.printf("%3d", matrixByUser[row][column]);
            }
            System.out.println();
        }
        int total = 0;
        for (int row = 0; row < matrixByUser.length; row++) {
            for (int column = 0; column < matrixByUser[0].length; column++) {
                total += matrixByUser[row][column];
            }
        }
        System.out.printf("\nThe total of the matrix is \"%d\"", total);
        int columnTotal = 0;
        for (int column = 0; column < matrixByUser[0].length; column++) {
            columnTotal = 0;
            for (int row = 0; row < matrixByUser.length; row++) {
                columnTotal += matrixByUser[row][column];
            }
            System.out.printf("\nThe total of the column of the matrix is \"%d\"", columnTotal);
        }
        int maxRow = 0;
        int indexOfMaxRow = 0;
        for (int i = 0; i < matrixByUser[0].length; i++) {
            maxRow += matrixByUser[0][i];
        }
        int totalOfEachRow = 0;
        for (int row = 1; row < matrixByUser.length; row++) {
            for (int column = 0; column < matrixByUser[0].length; column++) {
                totalOfEachRow += matrixByUser[row][column];
                if(maxRow<totalOfEachRow){
                    maxRow=totalOfEachRow;
                    indexOfMaxRow=row;
                }
            }
        }
        System.out.printf("\nThe max total in lines is %d and the index of that line is %d", maxRow,indexOfMaxRow);
    }
}
