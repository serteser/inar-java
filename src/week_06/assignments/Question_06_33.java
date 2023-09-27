package week_06.assignments;

public class Question_06_33 {
    public static void main(String[] args) {
        currentDateAndTime();
    }

    public static void currentDateAndTime() {
        long totalMilliseconds = System.currentTimeMillis();
        int currentHour = (int) (((totalMilliseconds / 1000) / 60) / 60) % 24;
        int currentMinute = (int) ((totalMilliseconds / 1000) / 60) % 60;
        int currentSecond = (int) (totalMilliseconds / 1000) % 60;
        int currentYear = getCurrentYear(totalMilliseconds);
        int currentDay = getCurrentDay(totalMilliseconds, currentYear);
        String nameOfMonth = getNameOfCurrentMonth(totalMilliseconds, currentYear);
        System.out.println("Current date and time is  " + nameOfMonth + " " + currentDay + ", " + currentYear + "  " + (currentHour + 3)%24 + " : "
                + currentMinute + " : " + currentSecond);

    }

    public static int getCurrentYear(long totalMilliseconds) {
        int totalDays = getTotalDays(totalMilliseconds);
        int year = 1970;
        while (totalDays > daysInYear(year)) {
            totalDays -= daysInYear(year);
            year++;
        }
        return year;

    }

    public static String getNameOfCurrentMonth(long totalMilliseconds, int year) {
        return switch (getCurrentMonth(totalMilliseconds, year)) {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "";
        };
    }

    public static int getCurrentDay(long totalMilliseconds, int year) {
        int totalDaysInCurrentYear = getTotalDaysInCurrentYear(totalMilliseconds);
        int month = 1;
        while (totalDaysInCurrentYear > daysInMonth(month, year)) {
            totalDaysInCurrentYear -= daysInMonth(month, year);
            month++;
        }
        return totalDaysInCurrentYear + 1; // one addition for the remaining hours...
    }

    public static int getCurrentMonth(long totalMilliseconds, int year) {
        int totalDaysInCurrentYear = getTotalDaysInCurrentYear(totalMilliseconds);
        int month = 1;
        while (totalDaysInCurrentYear > daysInMonth(month, year)) {
            totalDaysInCurrentYear -= daysInMonth(month, year);
            month++;
        }
        return month;
    }

    public static int getTotalDays(long totalMilliseconds) {
        return (int) (((totalMilliseconds / 1000) / 60) / 60) / 24;
    }

    public static int getTotalDaysInCurrentYear(long totalMilliseconds) {
        int totalDays = getTotalDays(totalMilliseconds);
        int year = 1970;
        while (totalDays > daysInYear(year)) {
            totalDays -= daysInYear(year);
            year++;
        }
        return totalDays;
    }

    public static int daysInMonth(int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else
            return 31;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year != 0);
    }

    public static int daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }
}
