package week_12.assignments.Question_12_06;

import java.util.Scanner;

public class Question_12_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        try {
            String hex = input.nextLine();
            System.out.println("The decimal value for the hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));

        } catch (NumberFormatException ex) {
            System.out.println("It is not a hex string.! ");
        }

    }

    public static int hexToDecimal(String hex) {

        int decimalValue = 0;
        if (isHexString(hex)) {
            for (int i = 0; i < hex.length(); i++) {
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char hexChar) {
        if ('A' <= Character.toUpperCase(hexChar) && Character.toUpperCase(hexChar) <= 'F') {
            return 10 + (hexChar - 'A');
        } else {
            return hexChar - '0';
        }
    }

    public static boolean isHexString(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if (!Character.isLetterOrDigit(ch) || (!('A' <= Character.toUpperCase(ch) && Character.toUpperCase(ch) <= 'F')
                    && !('0' <= Character.toUpperCase(ch) && Character.toUpperCase(ch) <= '9'))) {

                throw new NumberFormatException();
            }
        }
        return true;
    }

}
