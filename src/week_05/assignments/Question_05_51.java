package week_05.assignments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        int letter = 0; // The index of the differ character in strings;

        for (int i = 0; i < Math.max(firstString.length(), secondString.length()); i++) {

            int letterOfFirst = firstString.charAt(i);
            int letterOfSecond = secondString.charAt(i);

            if (letterOfFirst != letterOfSecond) {
                letter = i;

                break;
            }

        }

        if (letter > 0) {
            String longestCommonPrefix = firstString.substring(0, letter);
            System.out.printf("The common prefix is %s", longestCommonPrefix);
        } else {
            System.out.printf("%s and %s have no common prefix.", firstString, secondString);
        }


    }
}
