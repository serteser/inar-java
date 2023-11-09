package week_10.assignments.Question_10_19;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {

        headerOfMersennePrimeTable();
        primeNumbersWithMersennePrimesLessThan(100);

    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        } else {
            for (int i = 2; i <= value / 2; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void primeNumbersWithMersennePrimesLessThan(int number) {
        BigInteger mersenne;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.printf("%-3d", i);
                mersenne = powOfBigInteger(i).subtract(BigInteger.ONE);
                System.out.printf("           %-40d\n", mersenne);
            }
        }
    }

    public static BigInteger powOfBigInteger(int a) {
        BigInteger two = BigInteger.TWO;
        BigInteger big = new BigInteger("1");
        for (int i = 0; i < a; i++) {
            big = big.multiply(two);
        }
        return big;
    }

    public static void headerOfMersennePrimeTable() {
        System.out.println("p\t\t\t2^p - 1");
    }
}
