package week_12.assignments.Question_12_09;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        try {
            String binary = input.nextLine();
            BinaryFormatException binaryValue = new BinaryFormatException(binary);
            System.out.println("The decimal value for binary number " + binary + " is " + binaryValue.bin2Dec(binary));

        } catch (BinaryFormatException ex) {
            System.out.println(ex);
        }
    }
}
