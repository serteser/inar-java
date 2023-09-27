package week_06.live_class;

import java.util.Scanner;

public class ConvertingHexadecimalsToDecimalsSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your hexadecimal number: ");
        String hex = input.nextLine();
        hex=hex.toUpperCase();

        if(!isHexValue(hex)){
            System.out.println("invalid hex value!");
            System.exit(1);
        }

        System.out.printf("The number given in as hexadecimal system %s is %d in decimal system.\n", hex, hexToDecimal(hex));
    }

    public static boolean isHexValue(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(('A' <= ch && ch <= 'F')||('0'<=ch&&ch<='9'))){
                    return false;
            }
        }
        return true;
    }

    public static int hexToDecimal(String hex) {
        int hexToDecimal = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            hexToDecimal = hexToDecimal * 16 + hexCharToDecimal(hexChar);
        }
        return hexToDecimal;
    }

    public static int hexCharToDecimal(char hexChar) {
        if ('A' <= hexChar && hexChar <= 'F') {
            return 10 + hexChar - 'A';
        } else {
            return hexChar - '0';
        }

    }

}
