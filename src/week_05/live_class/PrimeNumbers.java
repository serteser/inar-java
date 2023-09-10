package week_05.live_class;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 1000; i++) {

            for (int divisor = 2; divisor <= i; divisor++) {
                if (i % divisor == 0) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.print(i + " ");
            }
            count = 0;

        }
        System.out.println();
    }
}
