package week_08.live_class;
import java.util.Scanner;
public class PassingTwoDimensionalArraysToMethods2 {
    public static void main(String[] args) {

        int[][] array = getArray();

         // Display sum of elements
         System.out.println("\nSum of all elements is " + sum(array));
    }

         public static int[][] getArray() {
             // Create a Scanner
             Scanner input = new Scanner(System.in);

             // Enter array values
             int[][] result = new int[3][4];
             System.out.println("Enter " + result.length + " rows and " +
                     result[0].length
                     + " colums: ");

             for (int i = 0; i < result.length; i++) {
                 for (int j = 0; j < result[i].length; j++) {
                     result[i][j] = input.nextInt();
                 }
             }
             return result;
         }

         public static int sum(int[][] array) {
             int total = 0;
             for (int i = 0; i < array.length; i++) {
                 for (int j = 0; j < array[i].length; j++) {
                     total += array[i][j];
                     }
             }
             return total;
         }

}
