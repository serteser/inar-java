package week_07.assignments;

import java.util.Arrays;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        for (int i = 1; i <= 100; i++) {
            for (int j = i - 1; j < lockers.length; j += i) {
                lockers[j] = !lockers[j];
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}
