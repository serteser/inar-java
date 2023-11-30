package week_13.assignments.Question_13_21;

import week_13.assignments.Question_13_15.RationalBigInteger;

import java.util.Scanner;

public class Question_13_21 {

    /**
     * Since linear terms to be equal, the coefficients must be equal.
     * <p>
     * a(x−h)² + k = ax² + bx + c
     * ax² − 2ahx + (ah²+k) = ax² + bx + c ;
     * <p>
     * –2ah = b  so
     * h = −b/2a ;
     * <p>
     * ah² + k = c  so
     * k = c − (b²/4a) ;
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c,: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double h = -b / (2 * a);
        double k = c - ((b * b) / (4 * a));

        System.out.print("h is " + doubleToRational(h));
        System.out.print("  k is " + doubleToRational(k));


    }

    public static RationalBigInteger doubleToRational(double val) {

        String s = val + "";
        String[] str = s.split("\\.");
        long numerator = Integer.parseInt(str[0] + str[1]);
        long denominator = Integer.parseInt(getDenominator(str[1]));
        return new RationalBigInteger(numerator, denominator);
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
