package week_07.assignments;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String word = input.nextLine();
        System.out.printf("sorted form: %s", sort(word));
    }

    public static String sort(String s) {
        s.toLowerCase();
        String sortedWord = " ";
        int[] charToInteger = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charToInteger[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            int currentMin = charToInteger[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < s.length(); j++) {
                if (currentMin > charToInteger[j]) {
                    currentMin = charToInteger[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                charToInteger[currentMinIndex] = charToInteger[i];
                charToInteger[i] = currentMin;
            }
        }
        for (int i = 0; i < charToInteger.length; i++) {
            char ch = (char) charToInteger[i];
            sortedWord += ch;
        }
        return sortedWord;
    }
}
