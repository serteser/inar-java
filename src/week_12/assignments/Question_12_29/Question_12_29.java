package week_12.assignments.Question_12_29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) {

        System.out.print("Enter a file name: ");
        String fileName = new Scanner(System.in).next(); // C:\Users\User\Workspace\inar-java\src\week_12\assignments\Question_12_29\file1.txt
        File file = new File(fileName);
        char[] ch = creatUpperCaseAlphabetArray();
        int[] occurrences = new int[26];

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {
                String s = input.next();
                s = s.toLowerCase();

                for (int i = 0; i < s.length(); i++) {
                    char chs = s.charAt(i);
                    if (chs == 'ı') {  // whenever and somehow the scanner object encounters to the 'ı' it cause an overflow of array-index
                        chs = 'i';
                    }
                    if (Character.isLetter(chs)) {
                        occurrences[chs - 'a']++;
                    }

                }
            }

            for (int i = 0; i < ch.length; i++) {
                if (occurrences[i] != 0) {
                    System.out.printf("Number of %s's: %d\n", ch[i], occurrences[i]);
                }
            }

        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }

    public static char[] creatUpperCaseAlphabetArray() {
        char[] ch = new char[26];
        for (int i = 65, k = 0; k < 26; i++, k++) {
            ch[k] = (char) i;
        }
        return ch;
    }

}
