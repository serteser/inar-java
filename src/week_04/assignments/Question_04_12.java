package week_04.assignments;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit = input.nextLine();
        char digit = hexDigit.charAt(0);
        //number = (int) digit;
        int number = digit - 55; // subtraction for reaching the hex value
        switch (number) {
            case 10:
                System.out.println("The binary value is 1010");
                break;
            case 11:
                System.out.println("The binary value is 1011");
                break;
            case 12:
                System.out.println("The binary value is 1100");
                break;
            case 13:
                System.out.println("The binary value is 1101");
                break;
            case 14:
                System.out.println("The binary value is 1110");
                break;
            case 15:
                System.out.println("The binary value is 1111");
                break;
            default:
                System.out.println(digit + " is an invalid input");


        }
    }
}
