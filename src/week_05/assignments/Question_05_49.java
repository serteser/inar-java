package week_05.assignments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        word = word.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int space = 0;

        for (int i = 1; i <= word.length(); i++) {

            int letters = word.charAt(word.length() - i);

            if (letters == 97 || letters == 101 || letters == 105 || letters == 111 || letters == 117) {

                vowels++;
            } else if (letters == 32) {
                space++;

            } else {
                consonants++;
            }

        }
        System.out.printf("The number of vowels is %d\nThe number of consonants is %d", vowels, consonants);

    }
}
