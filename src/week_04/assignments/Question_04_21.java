package week_04.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: "); // SSN refers to Social Security Number
        String string = input.nextLine();
        if (string.length() != 11) {
            System.out.println(string + " is an invalid social security number");
            System.exit(1);
        }
        String firstPartOfSsn = string.substring(0, 3);
        String secondPartOfSsn = string.substring(4, 6);
        String thirdPartOfSsn = string.substring(6 + 1);
        int first = Integer.parseInt(firstPartOfSsn);
        int second = Integer.parseInt(secondPartOfSsn);
        int third = Integer.parseInt(thirdPartOfSsn);

        if ((firstPartOfSsn.length() == 3) && (secondPartOfSsn.length() == 2) && (thirdPartOfSsn.length() == 4)) {
            if (first >= 0 && second >= 0 && third >= 0) {
            }
            if ((string.charAt(3) == 45) && (string.charAt(6) == 45)) {
                System.out.println(string + " is a valid social security number");
            }

        }
    }
}
