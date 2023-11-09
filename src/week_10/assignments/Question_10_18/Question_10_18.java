package week_10.assignments.Question_10_18;

import java.math.BigInteger;

public class Question_10_18 {
    public static void main(String[] args) {

        BigInteger big = BigInteger.valueOf(Long.MAX_VALUE);
        findPrimeNumbers(big);
    }

    public static void findPrimeNumbers(BigInteger big) {

        BigInteger two = new BigInteger("2");
        BigInteger twoConstant = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");

        boolean isInfinite = true;
        int count = 0;
        do {
            if (isPrimeForBigInteger(big)) {
                System.out.println(big);
                count++;
            }
            if (count == 2) {
                break;
            }
            big = big.add(one);
        } while (isInfinite);
    }

    public static boolean isPrimeForBigInteger(BigInteger b) {

        BigInteger two = new BigInteger("2");
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");

        BigInteger i = two;
        do {
            if (b.remainder(i).equals(zero)) {
                return false;
            }
            i = i.add(one);
        } while (!i.equals(b));
        return true;
    }

}

