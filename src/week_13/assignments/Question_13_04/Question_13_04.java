package week_13.assignments.Question_13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Question_13_04 {
    public static void main(String[] args) {

        //C:\Users\User\workspace\inar-java\out\production\inar-java> java week_13.assignments.Question_13_04.Question_13_04 5 2016
        if (args.length != 2) {
            System.out.println("Usage: java Question_13_04 5 2016");
            System.exit(1);
        }

        // Recall that to get the right day of the month, you must give the previous month's name into the constructor...
        Calendar calendar1 = new GregorianCalendar(Integer.parseInt(args[1]), (Integer.parseInt(args[0]) - 1), 1);

        int startingDayOfMonth = calendar1.get(Calendar.DAY_OF_WEEK) - 1;


        headerOfCalendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        bodyOfCalendar(startingDayOfMonth, Integer.parseInt(args[0]), Integer.parseInt(args[1]));

    }

    public static void headerOfCalendar(int month, int year) {
        System.out.printf("          %s, %d\n", nameOfMonth(month), year);
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void bodyOfCalendar(int startingDayOfMonth, int month, int year) {
        int daysOfMonth = daysOfMonth(month, year);
        int count = 0;
        for (int i = 1; i <= daysOfMonth; i++) {
            for (int j = 0; j < startingDayOfMonth; j++) {
                System.out.print("    ");
                count++;
            }
            startingDayOfMonth = 0;
            System.out.printf("%3d ", i);
            count++;
            if (count % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static String nameOfMonth(int month) {
        String[] months = {"january", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static int daysOfMonth(int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
