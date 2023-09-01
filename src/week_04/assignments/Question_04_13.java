package week_04.assignments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        String s = input.nextLine();
        char letter = s.charAt(0);
        //int letter = (int) ch;

        if (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 65 || letter == 69 || letter == 73 || letter == 79 ||
                        letter == 117 || letter == 85) {
                        System.out.println(letter + " is a vowel");
        } else if   ((66 <= letter && letter <= 68) || (70 <= letter && letter <= 72) ||
                    (74 <= letter && letter <= 78) || (80 <= letter && letter <= 84) ||
                    (86 <= letter && letter <= 90) || (98 <= letter && letter <= 100) ||
                    (102 <= letter && letter <= 104) || (106 <= letter && letter <= 110) ||
                    (112 <= letter && letter <= 116) || (118 <= letter && letter <= 122)) {
                        System.out.println(letter + " is a consonant");
        } else {
                        System.out.println(letter + " is an invalid input");
        }


    }
}
