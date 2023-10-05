package week_07.live_class;

import java.util.Scanner;

public class RandomShuffleString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        String oddLetters = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            int k = (int) (Math.random() * (i + 1));
            oddLetters += word.charAt(k);

        }
        System.out.print(oddLetters);

    }
}
