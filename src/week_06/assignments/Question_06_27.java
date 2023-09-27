package week_06.assignments;

public class Question_06_27 {
    public static void main(String[] args) {
        final int PALINDROMIC_PRIME_NUMBERS = 100;
        final int NUMBERS_PER_LINE = 10;
        System.out.println();
        printEmirp(PALINDROMIC_PRIME_NUMBERS, NUMBERS_PER_LINE);
    }

    public static void printEmirp(int numbers, int line) {
        int i = 2;
        int count = 0;
        do {
            if (!isPalindrome(i) && isPrime(i) && isReversePrime(i)) {
                count++;
                System.out.printf("%d ", i);
                if (count % line == 0) {
                    System.out.println();
                }
            }
            i++;
        } while (numbers != count);

    }

    public static boolean isPalindrome(int number) {
        String s = "" + number;
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            reverse = ch + reverse;
        }
        return (s.equals(reverse));
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isReversePrime(int number) {
        String s = "" + number;
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            reverse = ch + reverse;
        }
        int reverseNumber = Integer.parseInt(reverse);
        return isPrime(reverseNumber);
    }
}
