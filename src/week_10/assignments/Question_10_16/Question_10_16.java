package week_10.assignments.Question_10_16;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {

        BigInteger fiftyDigitsNumber = new BigInteger("10000000000000000000000000000000000000000000000000");
        findDivisibleBy2Or3(fiftyDigitsNumber);
    }

    public static void findDivisibleBy2Or3(BigInteger big) {

        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");

        boolean isInfinite = true;
        int count = 0;
        do {
            if (big.remainder(two).equals(zero)) {
                System.out.println(big);
                count++;
            } else if (big.remainder(three).equals(zero)) {
                System.out.println(big);
                count++;
            }
            if (count == 10) {
                break;
            }
            big = big.add(one);
        } while (isInfinite);
    }

}
