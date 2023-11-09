package week_10.assignments.Question_10_06;

import week_10.live_class.StackOfIntegers;

public class Question_10_06 {
    public static void main(String[] args) {
        final int PRIME_NUMBERS_LESS_THAN = 120;

        StackOfIntegers stack = findPrimeNumbersLessThan(PRIME_NUMBERS_LESS_THAN);
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static StackOfIntegers findPrimeNumbersLessThan(int PRIME_NUMBERS_LESS_THAN) {
        StackOfIntegers s = new StackOfIntegers();
        for (int i = 2; i < PRIME_NUMBERS_LESS_THAN; i++) {
            if (isPrime(i)) {
                s.push(i);
            }
        }
        return s;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
