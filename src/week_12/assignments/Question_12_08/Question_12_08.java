package week_12.assignments.Question_12_08;

import java.util.Scanner;

public class Question_12_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        try {
            String hex = input.nextLine();
            HexFormatException hexValue = new HexFormatException(hex);
            System.out.println("The decimal value for the hex number " + hex + " is " + hexValue.hexToDecimal(hex));

        } catch (HexFormatException ex) {
            System.out.println(ex );
        }
    }
}
