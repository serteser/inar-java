package week_06.assignments;

import java.util.Scanner;

public class Question_06_34 {
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
        for (int i = dayOfWeek(year, month); i >= 1; i--) {
            System.out.print("     ");

        }
        int count = 0;
        for (int j = 1; j <= numberOfDaysInMonth(year, month); j++) {
            count++;
            System.out.printf("%2d   ", j);
            if ((dayOfWeek(year, month) + count) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int numberOfDaysInMonth(int year, int month) {

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else
            return 31;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static int dayOfWeek(int year, int month) {
        if (month == 1) {
            month = 13;
            year = year - 1;
        } else if (month == 2) {
            month = 14;
            year = year - 1;
        }
        return ((26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
    }

}
