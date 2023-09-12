package week_05.assignments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        String oddLetters = "";

        for (int i = 1; i <= word.length(); i++) {
            int k = (int) (Math.random() * (word.length() - 1));
            oddLetters += word.charAt(k);

        }
        System.out.println(oddLetters);
    }
}
