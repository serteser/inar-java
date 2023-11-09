package week_09.assignments.Question_09_04;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {

        Random random = new Random(1000);

        System.out.println("Random numbers are: \n");

        int count = 1;
        for (int i = 0; i < 50; i++) {
            System.out.printf("%4d", random.nextInt(100));
            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
        }
    }
}
