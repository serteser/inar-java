package week_07.live_class;

import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the full year: ");
        int year = input.nextInt();
        System.out.print("Enter the month as an integer: ");
        int month = input.nextInt();
        printCalender(year, month);
    }

    public static void printCalender(int year, int month) {
        printHeaderOfCalender(year, month);
        printBodyOfCalendar(year, month);
    }

    public static void printHeaderOfCalender(int year, int month) {
        System.out.printf("      %s %10d\n", nameOfMonth(month), year);
        System.out.println("---------------------------------");
        System.out.printf("%s  %s  %s  %s  %s  %s  %s ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        System.out.println();
    }

    public static void printBodyOfCalendar(int year, int month) {
        int startDayOfMonth = getStartDayOfMonth(year, month);
        for (int i = 1; i <= startDayOfMonth; i++) {
            System.out.print("     ");
        }
        int count = 0;
        for (int i = 1; i <= numberOfDaysInMonth(year, month); i++) {
            System.out.printf("%3d  ", i);
            count++;
            if ((count + startDayOfMonth) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int getStartDayOfYear(int year) {
        int totalDays = 0;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        return (totalDays + 3) % 7;
    }

    public static String nameOfMonth(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }

    public static int getStartDayOfMonth(int year, int month) {
        int startDayOfYear = getStartDayOfYear(year);
        int totalDaysInYear = 0;
        for (int i = 1; i < month; i++) {
            totalDaysInYear += numberOfDaysInMonth(year, i);
        }
        return (totalDaysInYear + startDayOfYear) % 7;
    }

    public static int numberOfDaysInMonth(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
