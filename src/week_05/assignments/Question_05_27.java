package week_05.assignments;

public class Question_05_27 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int i;
        int count = 0;


        System.out.println("All the leap years from 101 to 2100: ");

        for (i = 101; i < 2100; i++) {
            if (i % 4 == 0) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }

            }
        }


    }
}
