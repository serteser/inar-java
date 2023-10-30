package week_09.assignments;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {

        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate(currentDate);

        currentDate.setTimeInMillis(1234567898765L);
        System.out.println("\nAfter setTime");
        currentDate(currentDate);

    }

    public static void currentDate(GregorianCalendar c) {
        int year = c.get(GregorianCalendar.YEAR);
        System.out.println("Current year: " + year);
        int month = c.get(GregorianCalendar.MONTH);
        System.out.println("Current month: " + month);
        int day = c.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Current day: " + day);
    }
}
