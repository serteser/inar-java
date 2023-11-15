package week_11.assignments.Question_11_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {

        int[][] binary = getMatrix();
        printMatrix(binary);
        ArrayList<Integer> row = rowIndicesAccordingToOne(binary);
        System.out.print("The largest row index: ");
        displayLargestIndices(row);
        ArrayList<Integer> column = columnIndicesAccordingToOne(binary);
        System.out.print("\nThe largest column index: ");
        displayLargestIndices(column);
    }

    public static int[][] getMatrix() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int[][] m = new int[n][n];
        for (int row = 0; row < m.length; row++) {

            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = (int) (Math.random() * 2);
            }
        }
        return m;
    }

    public static void printMatrix(int[][] m) {
        System.out.println("The random array is ");
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> rowIndicesAccordingToOne(int[][] b) {
        ArrayList<Integer> rowControl = new ArrayList<>();
        for (int row = 0; row < b.length; row++) {
            int count = 0;
            for (int column = 0; column < b[0].length; column++) {
                if (b[row][column] == 1) {
                    count++;
                }
            }
            rowControl.add(count);
        }

        return largestIndices(rowControl);
    }

    public static ArrayList<Integer> columnIndicesAccordingToOne(int[][] b) {
        ArrayList<Integer> columnControl = new ArrayList<>();
        for (int column = 0; column < b[0].length; column++) {
            int count = 0;
            for (int row = 0; row < b.length; row++) {
                if (b[row][column] == 1) {
                    count++;
                }
            }
            columnControl.add(count);
        }
        return largestIndices(columnControl);
    }

    public static ArrayList<Integer> largestIndices(ArrayList<Integer> a) {
        ArrayList<Integer> rowControl1 = new ArrayList<>();
        int max = Collections.max(a);
        for (int i = 0; i < a.size(); i++) {
            if (max == a.get(i)) {
                rowControl1.add(i);
            }
        }
        return rowControl1;
    }

    public static void displayLargestIndices(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

}