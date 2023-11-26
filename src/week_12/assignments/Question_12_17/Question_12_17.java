package week_12.assignments.Question_12_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter wordlist file pathname for Hangman game :"); // C:\Users\User\workspace\inar-java\src\week_12\assignments\Question_12_17\hangman.txt
        String pathName = input.nextLine();
        File file = new File(pathName);
        ArrayList<String> list = new ArrayList<>();

        try (Scanner inputHangman = new Scanner(file)) {
            while (inputHangman.hasNext()) {
                list.add(inputHangman.next());
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getStackTrace());
        }

        String[] words = new String[list.size()];
        list.toArray(words);
        System.out.print("\nDo you want to play a game, \"hangman\" ? \nEnter Y or N ");

        String s = input.nextLine();
        char ch = s.charAt(0);
        if (ch == 'N' || ch == 'n') {
            System.out.println("Ok then I'll be here whenever you wish!");
        } else if (ch == 'Y' || ch == 'y') {
            boolean isGameStrictlyOver = true;
            do {
                int wordChooser = (int) (Math.random() * 10);
                String word = words[wordChooser];
                char[] chosenWord = wordToArray(word);
                char[] chosenWordInAsterisk = new char[word.length()];
                Arrays.fill(chosenWordInAsterisk, '*');

                String repeatedLetter = " ";
                int counter = 0;
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
                    for (int i = 0; i < chosenWord.length; i++) {

                        if (chosenWord[i] == ch) {
                            chosenWordInAsterisk[i] = ch;
                            ++counter;
                        } else if (counter == (word.length() - 1) && !word.contains(s)) {
                            System.out.printf("The word is %3s. You missed 1 time\n", word);
                            isGameOver = false;
                            break;
                        } else if (repeatedLetter.contains(s)) {
                            System.out.printf("%8c is already tried\n", ch);
                            break;
                        } else if (counter == (word.length()) && word.contains(s)) {
                            System.out.printf("Yes you got it! The word is %3s.\n", word);
                            isGameOver = false;
                            break;
                        } else if (!word.contains(s)) {
                            System.out.printf("%8c is not in the word\n", ch);
                            break;
                        }

                    }
                    repeatedLetter += " " + tryingLetter;

                } while (isGameOver);
                System.out.println("Do you want to guess another word? Enter Y or N > ");
                s = input.nextLine();
                ch = s.charAt(0);
                if (ch == 'N' || ch == 'n') {
                    isGameStrictlyOver = false;
                }
            } while (isGameStrictlyOver);
        }
    }

    public static char[] wordToArray(String word) {
        char[] chosenWord = new char[word.length()];
        for (int i = 0; i < chosenWord.length; i++) {
            chosenWord[i] = word.charAt(i);
        }
        return chosenWord;
    }
}
