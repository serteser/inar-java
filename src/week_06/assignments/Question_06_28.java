package week_06.assignments;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.printf("%c %17s\n", 'p', "2^p-1");
        System.out.println("-------------------");

        int i = 2;
        do {
            if (isPrime(i) && isMersennePrime(i)) {
                System.out.printf("%-2d            %-10d\n", i, (int) (Math.pow(2, i) - 1));
            }
            i++;
        } while (i <= 31);


    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMersennePrime(int number) {
        return isPrime((int) (Math.pow(2, number) - 1));
    }
}
