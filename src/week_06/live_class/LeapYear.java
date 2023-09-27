package week_06.live_class;

public class LeapYear {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1970; i <= 2023; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                count++;
            }
        }
        //System.out.println(count);
        System.out.println(startDayOfYear(2031));
    }

    public static String startDayOfYear(int year) {
        String day = "The first day of " + year + " is";
        int totalDays = 0;
        for (int i = 1800; i < year; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        int numberOfWeekDay = (totalDays +3 )%7;
        switch (numberOfWeekDay) {
            case 0 : day += " Sunday"; break;
            case 1 : day += " Monday"; break;
            case 2 : day += " Tuesday"; break;
            case 3 : day += " Wednesday"; break;
            case 4 : day += " Thursday"; break;
            case 5 : day += " Friday"; break;
            case 6 : day += " Saturday"; break;

        }
        return day;
    }


}

