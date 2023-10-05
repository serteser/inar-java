package week_07.live_class;

public class CountingTheOccurrencesOfEachLetter {
    public static void main(String[] args) {
        char[] lowerCaseLetter = new char[100];
        char[] counts = new char[26];
        int countOfLowerCaseLetters = 0;
        System.out.println("\nThe lowercase letters are: ");
        for (int i = 0; i < lowerCaseLetter.length; i++) {
            lowerCaseLetter[i] = getRandomLowerCaseLetter();
            countOfLowerCaseLetters++;
            System.out.print(lowerCaseLetter[i] + " ");
            if (countOfLowerCaseLetters % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        int countOfRepeatedOccurrences = 0;
        System.out.println("The occurrences of each letter are: ");
        char ch = 'a';
        for (int i = 0; i < counts.length; i++) {
            counts[i] = ch;
            ch++;
        }

        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < lowerCaseLetter.length; j++) {
                if (counts[i] == lowerCaseLetter[j]) {
                    countOfRepeatedOccurrences++;
                }
            }
            System.out.printf("%d %c ", countOfRepeatedOccurrences, counts[i]);
            if (counts[i] == 'j' || counts[i] == 't') {
                System.out.println();
            }
            countOfRepeatedOccurrences = 0;
        }

    }
    public static char getRandomLowerCaseLetter() {
        return (char) ('a' + (Math.random() * ('{' - 'a')));
    }
}
