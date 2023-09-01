package week_03.assignments;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();
        int dayOfWeek = 0;

        if (month == 1) {
            dayOfWeek = (dayOfMonth + ((26 * (month + 13)) / 10) + ((year - 1) % 100) + ((year - 1) % 100 / 4) + ((year - 1) / 100 / 4) + ((5 * (year - 1)) / 100)) % 7;
        } else if (month == 2) {
            dayOfWeek = (dayOfMonth + ((26 * (month + 14)) / 10) + ((year - 1) % 100) + ((year - 1) % 100 / 4) + ((year - 1) / 100 / 4) + ((5 * (year - 1)) / 100)) % 7;
        } else {
            dayOfWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + (year % 100) + (year % 100 / 4) + (year / 100 / 4) + (5 * year / 100)) % 7;
        }
        System.out.print("Day of the week is ");

        if (dayOfWeek == 0) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 1) {
            System.out.println("Sunday");
        } else if (dayOfWeek == 2) {
            System.out.println("Monday");
        } else if (dayOfWeek == 3) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 5) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 6) {
            System.out.println("Friday");
        }


    }
}
