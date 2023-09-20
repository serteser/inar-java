package week_06.assignments;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.printf("The number of letters in the string \"%s\": %d", s, countLetters(s));
    }

    public static int countLetters(String s) {
        int countLetters = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                countLetters++;
            }
        }
        return countLetters;
    }
}
