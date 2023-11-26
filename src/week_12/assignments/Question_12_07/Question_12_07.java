package week_12.assignments.Question_12_07;

import java.util.Scanner;

public class Question_12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        try {
            String binary = input.nextLine();
            System.out.println("The decimal value for binary number " + binary + " is " + bin2Dec(binary));

        } catch (NumberFormatException ex) {
            System.out.println("It is not a binary string ");
        }
    }

    public static int bin2Dec(String binary) {

        int result = 0;
        if (isBinary(binary)) {
            for (int i = binary.length() - 1, j = 0; i >= 0; i--, j++) {
                char ch = binary.charAt(i);
                int digit = ch - '0';
                result += (digit * (int) Math.pow(2, j));
            }
            return result;
        } else {
            throw new NumberFormatException();
        }

    }

    public static boolean isBinary(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }

}
