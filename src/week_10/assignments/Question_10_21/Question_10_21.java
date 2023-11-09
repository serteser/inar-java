package week_10.assignments.Question_10_21;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {

        tenNumbersGreaterThanLongMaxValueDivisibleBy5Or6();
    }

    public static boolean divisibleBy5(BigInteger b) {
        BigInteger five = BigInteger.valueOf(5);
        BigInteger zero = BigInteger.ZERO;
        return (b.remainder(five).equals(zero));
    }

    public static boolean divisibleBy6(BigInteger b) {
        BigInteger six = BigInteger.valueOf(6);
        BigInteger zero = BigInteger.ZERO;
        return (b.remainder(six).equals(zero));
    }

    public static boolean divisibleBy5Or6(BigInteger b) {
        return (divisibleBy5(b) || divisibleBy6(b));
    }

    public static void tenNumbersGreaterThanLongMaxValueDivisibleBy5Or6() {
        BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger one = BigInteger.ONE;
        System.out.println("First ten numbers greater than Long.Max_Value that are divisible by 5 or 6: ");
        int count = 0;
        do {
            if (divisibleBy5Or6(b)) {
                System.out.println(b);
                count++;
            }
            b = b.add(one);
        } while (count != 10);
    }
}
