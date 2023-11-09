package week_10.assignments.Question_10_14;


import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;


    public MyDate() {
        GregorianCalendar calender = new GregorianCalendar();
        this.year = calender.get(GregorianCalendar.YEAR);
        this.month = calender.get(GregorianCalendar.MONTH);
        this.day = calender.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(day + "/" + (month + 1) + "/" + year);

    }

    public MyDate(long elapsedTime) {
        GregorianCalendar elapsed = new GregorianCalendar();
        elapsed.setTimeInMillis(elapsedTime);
        this.year = elapsed.get(GregorianCalendar.YEAR);
        this.month = elapsed.get(GregorianCalendar.MONTH);
        this.day = elapsed.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(day + "/" + (month + 1) + "/" + year);
    }

    public MyDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println(this.day + "/" + this.month + "/" + this.year);

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar elapsed = new GregorianCalendar();
        elapsed.setTimeInMillis(elapsedTime);
        this.year = elapsed.get(GregorianCalendar.YEAR);
        this.month = elapsed.get(GregorianCalendar.MONTH);
        this.day = elapsed.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(day + "/" + (month + 1) + "/" + year);
    }
}
