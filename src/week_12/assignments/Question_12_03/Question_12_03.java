package week_12.assignments.Question_12_03;

import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = getArray();
        System.out.print("Enter the index of the array: ");

        try {
            int chosenIndex = input.nextInt();
            System.out.println("You chose: " + list[chosenIndex]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of bounds.!!");
        }


    }

    public static int[] getArray() {
        int[] n = new int[100];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100);
        }
        return n;
    }


}
