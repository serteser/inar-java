package week_06.assignments;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character that you want to count: ");
        String s = input.nextLine();
        char a = s.charAt(0);
        System.out.println(count(str, a));
    }

    public static int count(String str, char a) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == a) {
                count++;

            }
        }
        return count;
    }
}
