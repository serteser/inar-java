package week_06.assignments;

public class Question_06_10 {
    public static void main(String[] args) {

        final int NUMBER = 10000;
        int count = 0;

        for (int i = 1; i < NUMBER; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.printf("The number of prime number less than %d is: %d", NUMBER, count);
    }

    public static boolean isPrime(int number) {
        boolean result = false;
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == 1) {
                    result = true;
                }
            } else {
                result = false;
            }
        }
        return result;

    }

}
