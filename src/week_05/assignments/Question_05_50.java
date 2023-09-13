package week_05.assignments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String words = input.nextLine();

        int uppercase = 0;

        // The numbers for upper case letters are (65-90)

        for (int i = 1; i <= words.length(); i++) {

            int letters = words.charAt(words.length() - i);

            if (65 <= letters && letters <= 90) {
                uppercase++;
            }
        }
        System.out.printf("The number of uppercase letters are %d.", uppercase);


    }
}
