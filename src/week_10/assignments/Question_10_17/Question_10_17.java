package week_10.assignments.Question_10_17;

import java.math.BigInteger;

public class Question_10_17 {
    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger b = a.multiply(a);
        BigInteger c = b.sqrt();
        BigInteger d = c.sqrt();

        squareNumbers(d);
    }

    public static void squareNumbers(BigInteger big) {
        System.out.println(Long.MAX_VALUE);
        BigInteger one = new BigInteger("1");
        int count = 0;
        do {
            big = big.add(one);
            System.out.println(big.multiply(big));
            count++;
        } while (count != 10);
    }
}
