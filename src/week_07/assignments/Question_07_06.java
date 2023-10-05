package week_07.assignments;

public class Question_07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int i = 2;
        int j = 0;
        int count = 0;
        while ((count != 50)) {
            if (isPrime(i)) {
                count++;
                while (j < primeNumbers.length) {

                    primeNumbers[j] = i;
                    System.out.printf("%4d ", primeNumbers[j]);

                    if (count % 10 == 0) {
                        System.out.println();
                    }
                    break;
                }
                j++;
            }
            i++;
        }

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
