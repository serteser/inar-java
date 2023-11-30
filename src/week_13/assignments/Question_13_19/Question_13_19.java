package week_13.assignments.Question_13_19;

import week_13.assignments.Question_13_15.RationalBigInteger;

import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {

        System.out.print("Enter a decimal number: ");
        String decimal = new Scanner(System.in).nextLine();
        String[] str = decimal.split(",");

        long numerator = Integer.parseInt(str[0] + str[1]);
        long denominator = Integer.parseInt(getDenominator(str[1]));

        RationalBigInteger ration = new RationalBigInteger(numerator, denominator);
        System.out.println("The fraction number is " + ration);
    }

    public static String getDenominator(String s) {
        int length = s.length();
        s = "";
        for (int i = 0, k = 0; i < length; i++) {
            s += k;
        }
        return "1" + s;
    }
}
