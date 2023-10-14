package week_08.live_class;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"computer", "cup", "umbrella", "pasta", "bike", "write", "grand", "plant", "fragrance", "cream"};
        System.out.print("\nDo you want to play a game, \"hangman\" ? \nEnter Y or N ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        if (ch == 'N' || ch == 'n') {
            System.out.println("Ok then I'll be here whenever you wish!");
        } else if (ch == 'Y' || ch == 'y') {
            boolean isGameStritclyOver = true;
            do {
                int wordChooser = (int) (Math.random() * 10);
                String word = words[wordChooser];
                char[] chosenWord = wordToArray(word);
                char[] chosenWordInAsterisk = new char[word.length()];
                //System.arraycopy(chosenWord, 0, chosenWordInAsterisk, 0, word.length());
                Arrays.fill(chosenWordInAsterisk, '*');
                //System.out.println(Arrays.toString(chosenWordInAsterisk));

                char[] trying = {'w','r','i','t','e'};
                String k = "write";
                System.out.print(k.contains("r") ? "yes" : "no");



                String repeatedLetter = " ";
                //int totalCounter = 0;
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

                        if (chosenWord[i] == ch ^ repeatedLetter.contains(s)) {
                            chosenWordInAsterisk[i] = ch;
                            ++counter;
                            //break;
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
                    //totalCounter += counter;
                    System.out.println("counter=>" + counter);
                    //System.out.println("totalCounter=>" + totalCounter);
                    //repeatedLetter += " " + tryingLetter;
                    //counter = 0;
                    //tryingLetter = " ";


                } while (isGameOver);
                System.out.println("Do you want to guess another word? Enter Y or N > ");
                s = input.nextLine();
                ch = s.charAt(0);
                if (ch == 'N' || ch == 'n') {
                    isGameStritclyOver = false;
                    //break;
                }// else {
                // isGameOver = true;

                //}

            } while (isGameStritclyOver);

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
