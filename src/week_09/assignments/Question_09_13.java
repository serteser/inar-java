package week_09.assignments;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {

        double[][] numbers = getMatrix();
        Location location = locateLargest(numbers);
        System.out.printf("The location of the largest element is %.1f at (%d, %d)", location.getMaxValue(), location.getRow(), location.getColumn());

    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        System.out.println("Enter the array: ");
        double[][] n = new double[rows][columns];
        for (int row = 0; row < n.length; row++) {
            for (int column = 0; column < n[0].length; column++) {
                n[row][column] = input.nextDouble();
            }
        }
        return n;
    }

    public static Location locateLargest(double[][] a) {
        double maxValues = a[0][0];
        int i = 0;
        int j = 0;
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[0].length; column++) {
                if (maxValues < a[row][column]) {
                    maxValues = a[row][column];
                    i = row;
                    j = column;
                }
            }
        }
        Location l = new Location(i, j, maxValues);
        return l;
    }
}
