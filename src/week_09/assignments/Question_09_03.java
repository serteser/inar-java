package week_09.assignments;

import java.util.Date;

public class Question_09_03 {
    public static void main(String[] args) {

        for (long i = 0, t = 10000; i < 8; i++, t *= 10) {
            System.out.printf("For elapsed %d time is ", t);
            Date date = new Date(t);
            System.out.println(date);
        }
    }
}
