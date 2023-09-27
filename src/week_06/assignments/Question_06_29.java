package week_06.assignments;

public class Question_06_29 {
    public static void main(String[] args) {
        final int TWIN_PRIMES_LESS_THAN = 1000;

        for (int i = 2; i < TWIN_PRIMES_LESS_THAN; i++) {
            if (isTwinPrime(i)) {
                System.out.printf("(%d, %d)\n", i, ((i) + 2));
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTwinPrime(int number) {
        return (isPrime(number) && isPrime((number + 2)));
    }

}
