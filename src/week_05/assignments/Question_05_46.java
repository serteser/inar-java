package week_05.assignments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        String reverseWord = "";

        for (int i = 1; i <= (word.length()); i++) {

                reverseWord += word.charAt(word.length()-i);

        }
        System.out.printf("The reverse string is %s", reverseWord);
    }
}
