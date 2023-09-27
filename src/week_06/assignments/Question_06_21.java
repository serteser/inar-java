package week_06.assignments;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String display = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetter(ch)) {
                display += "" + ch;
            } else if (Character.isLetter(ch)) {
                display += "" + getNumber(Character.toUpperCase(ch));
            }

        }
        System.out.println(display);
    }

    public static int getNumber(char uppercaseLetter) {
        int result = 1;
        if (uppercaseLetter >= 'W') {
            result = 9;
        } else if (uppercaseLetter >= 'T') {
            result = 8;
        } else if (uppercaseLetter >= 'P') {
            result = 7;
        } else if (uppercaseLetter >= 'M') {
            result = 6;
        } else if (uppercaseLetter >= 'J') {
            result = 5;
        } else if (uppercaseLetter >= 'G') {
            result = 4;
        } else if (uppercaseLetter >= 'D') {
            result = 3;
        } else if (uppercaseLetter >= 'A') {
            result = 2;
        }
        return result;
    }
}
