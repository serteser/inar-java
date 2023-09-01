package week_04.live_class;

import java.util.Scanner;

public class ReadingStringFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words separated by spaces: ");
        String firstWord = input.next();
        String secondWord = input.next();
        String thirdWord = input.next();

        System.out.println("first word is \n" + firstWord);
        System.out.println("second word is \n" + secondWord);
        System.out.println("third word is \n" + thirdWord);
        input = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line = input.nextLine();
        System.out.println("The line is " + line);
    }
}
