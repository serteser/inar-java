package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"computer", "cup", "umbrella", "pasta", "bike", "write", "glass", "plant", "fragrance", "cool"};
        System.out.print("\nDo you want to play a game, \"hangman\" ? \nEnter Y or N ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        if (ch == 'N' || ch == 'n') {
            System.out.println("Ok then I'll be here whenever you wish!");
        } else if (ch == 'Y' || ch == 'y') {
            int wordChooser = (int) (Math.random() * 11);
            String word = words[wordChooser];
            char[] chosenWord = wordToArray(word);
            char[] chosenWordInAsterisk = new char[word.length()];
            //System.arraycopy(chosenWord, 0, chosenWordInAsterisk, 0, word.length());
            Arrays.fill(chosenWordInAsterisk, '*');
            //System.out.println(Arrays.toString(chosenWordInAsterisk));
            boolean isGameOver = true;
            do {
                System.out.print("(Guess) Enter a letter in word  ");
                for (int i = 0; i < chosenWord.length; i++) {
                    System.out.print(chosenWordInAsterisk[i] + " ");
                }
                System.out.print("> ");
                s = input.nextLine();
                ch = s.charAt(0);
                String tryingLetter = " " + ch;
                String repeatedLetter = " ";
                int counter = 0;
                for (int i = 0; i < chosenWord.length; i++) {
                    if (chosenWord[i] == ch) {
                        chosenWordInAsterisk[i] = ch;
                        counter++;
                        if (repeatedLetter.contains(tryingLetter)) {
                            System.out.printf("%8c is already in the word\n", ch);
                        }
                    } else if (i == (chosenWord.length - 1) && counter == 0) {
                        System.out.printf("%8c is not in the word\n", ch);
                    }

                }

                repeatedLetter += " " +tryingLetter;
                counter = 0;
                tryingLetter = " ";


            } while (isGameOver);

        }

    }

    public static char[] wordToArray(String word) {
        char[] chosenWord = new char[word.length()];
        for (int i = 0; i < chosenWord.length; i++) {
            chosenWord[i] = word.charAt(i);
        }
        //for (int i = 0; i < chosenWord.length; i++) {
        //    System.out.print(chosenWord[i] + "");
        //}
        return chosenWord;
    }
}
