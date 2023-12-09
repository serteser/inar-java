package week_14.assignments.Question_14_12;

import java.util.Scanner;

public class Question_14_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        char[] repeatedCharacter = repeatedCharacter(s);
        System.out.printf("The first non-repeating character is '%c': %c. character of the string.", repeatedCharacter[0], ((repeatedCharacter[1]) +1) );
    }

    public static char[] repeatedCharacter(String s) {

        char[] result = new char[2];
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        s = "";
        boolean isRepeated = false;
        char repeatedCh = ' ';
        int repeatedChIndex = -1;
        int l = 0;
        for (int i = 0; i < ch.length; i++) {

            isRepeated = false;
            if (!isRepeated && l == ch.length-1 ) {

                break;
            }
            repeatedCh = ch[i];
            repeatedChIndex = i;
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {

                    isRepeated = true;
                    break;
                }
                l = j;
            }
        }
        if (!isRepeated) {

            s = "" + repeatedCh + repeatedChIndex;
            s = s.toUpperCase();
            result = s.toCharArray();
        }
        return result;
    }
}
