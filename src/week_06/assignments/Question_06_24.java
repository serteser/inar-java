package week_06.assignments;

public class Question_06_24 {
    public static void main(String[] args) {
        currentTimeAndDate();
    }

    public static void currentTimeAndDate() {
        long totalMilliSeconds = System.currentTimeMillis();
        int currentSecond = (int) ((totalMilliSeconds / 1000) % 60);
        int currentMinute = (int) (((totalMilliSeconds / 1000) / 60) % 60);
        int currentHour = (int) ((((totalMilliSeconds / 1000) / 60) / 60) % 24);
        int currentYear = getCurrentYear(totalMilliSeconds);
        int currentMonth = getCurrentMonth(totalMilliSeconds, currentYear);
        int currentDay = getCurrentDay(totalMilliSeconds, currentYear);

        System.out.println("Current time and date is :  " + ((currentHour + 3) % 12) + " : " + currentMinute + " : " + currentSecond +
                (((currentHour + 3) >= 12) ? " PM" : " AM") + "         " + currentMonth + " / " + currentDay + " / " + currentYear);
    }

    public static int getCurrentYear(long milliseconds) {
        int totalDays = getTotalDays(milliseconds);
        int year = 1970;
        while (totalDays > daysInYear(year)) {
            totalDays -= daysInYear(year);
            year++;
        }
        return year;
    }

    public static int getCurrentMonth(long milliseconds, int year) {

        int numberOfDaysInCurrentYear = getTotalDaysInCurrentYear(milliseconds, year);
        int month = 1;
        while (numberOfDaysInCurrentYear > getNumberOfDaysInMonth(month, year)) {
            numberOfDaysInCurrentYear -= getNumberOfDaysInMonth(month, year);
            month++;
        }

        return month;
    }

    public static int getCurrentDay(long milliseconds, int year) {
        int totalDaysInCurrentYear = getTotalDaysInCurrentYear(milliseconds, year);
        int month = 1;
        while (totalDaysInCurrentYear > getNumberOfDaysInMonth(month, year)) {
            totalDaysInCurrentYear -= getNumberOfDaysInMonth(month, year);
            month++;
        }
        return totalDaysInCurrentYear + 1;


    }

    public static int getTotalDays(long milliseconds) {
        return (int) ((((milliseconds / 1000) / 60) / 60) / 24);
    }

    public static int getTotalDaysInCurrentYear(long milliseconds, int year) {
        int sum = 0;
        for (int i = 1970; i < year; i++) {
            sum += isLeapYear(i) ? 366 : 365;
        }
        return getTotalDays(milliseconds) - sum;
    }

    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 30;
        }
    }

    public static int daysInYear(int year) {
        return (isLeapYear(year)) ? 366 : 365;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

