package week_08.assignments;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {

        // Get the input from user
        System.out.print("Enter list1: ");
        int[][] list1 = getAMatrix();
        System.out.print("Enter list2: ");
        int[][] list2 = getAMatrix();

        // Display the result whether the arrays are strictly identical
        System.out.println("The two arrays are " + (equals(list1, list2) ? "" : " not") + "strictly identical");

    }

    public static int[][] getAMatrix() {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][3];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = input.nextInt();
            }
        }
        return m;
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }
        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[0].length; column++) {
                if (m1[row][column] != m2[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }
}
