package week_06.live_class;

import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year: ");
        int year = input.nextInt();
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();
        printHeaderOfCalendar(year, month);
        printBodyOfCalendar(year, month);
    }

    public static void printHeaderOfCalendar(int year, int month) {
        String s = "";
        switch (month) {
            case 1:
                s += "January";
                break;
            case 2:
                s += "February";
                break;
            case 3:
                s += "March";
                break;
            case 4:
                s += "April";
                break;
            case 5:
                s += "May";
                break;
            case 6:
                s += "June";
                break;
            case 7:
                s += "July";
                break;
            case 8:
                s += "August";
                break;
            case 9:
                s += "September";
                break;
            case 10:
                s += "October";
                break;
            case 11:
                s += "November";
                break;
            case 12:
                s += "December";
                break;
        }
        System.out.printf("  %10s %10d\n", s, year);
        System.out.println("----------------------------------");
        System.out.printf("%s  %s  %s  %s  %s  %s  %s", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    }

    public static void printBodyOfCalendar(int year, int month) {
        System.out.println();
        for (int i = getStartDayOfMonth(year, month); i >= 1; i--) {
            System.out.print("     ");

        }
        int count = 0;
        for (int j = 1; j <= numberOfDaysInMonth(year, month); j++) {
            count++;
            System.out.printf("%2d   ", j);
            if ((getStartDayOfMonth(year, month) + count) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int numberOfDaysInMonth(int year, int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }

    }


    public static int getStartDayOfYear(int year) {
        int totalDays = 0;
        for (int i = 1800; i < year; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        return (totalDays + 3) % 7;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static int getStartDayOfMonth(int year, int month) {
        int totalDays = 0;

        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                totalDays += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                totalDays += 30;
            } else {
                if (isLeapYear(year)) {
                    totalDays += 29;
                } else {
                    totalDays += 28;
                }
            }
        }
        return (totalDays + getStartDayOfYear(year)) % 7;

    }
}
