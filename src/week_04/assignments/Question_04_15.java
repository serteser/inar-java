package week_04.assignments;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        if ((65 <= ch && ch <= 67) || (65 + 32 <= ch && ch <= 67 + 32)) {
            System.out.println("The correspondent number is 2");
        } else if ((68 <= ch && ch <= 70) || (68 + 32 <= ch && ch <= 70 + 32)) {
            System.out.println("The correspondent number is 3");
        } else if ((71 <= ch && ch <= 73) || (71 + 32 <= ch && ch <= 73 + 32)) {
            System.out.println("The correspondent number is 4");
        } else if ((74 <= ch && ch <= 76) || (74 + 32 <= ch && ch <= 76 + 32)) {
            System.out.println("The correspondent number is 5");
        } else if ((77 <= ch && ch <= 79) || (77 + 32 <= ch && ch <= 79 + 32)) {
            System.out.println("The correspondent number is 6");
        } else if ((80 <= ch && ch <= 83) || (80 + 32 <= ch && ch <= 83 + 32)) {
            System.out.println("The correspondent number is 7");
        } else if ((84 <= ch && ch <= 86) || (84 + 32 <= ch && ch <= 86 + 32)) {
            System.out.println("The correspondent number is 8");
        } else if ((87 <= ch && ch <= 90) || (87 + 32 <= ch && ch <= 90 + 32)) {
            System.out.println("The correspondent number is 9");
        } else {
            System.out.println(ch + " is an invalid input");
        }


    }
}
