package week_10.assignments.Question_10_01;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        long milliseconds = System.currentTimeMillis();
        this.hour = (int) (milliseconds / 1000 / 60 / 60 % 24);
        this.minute = (int) (milliseconds / 1000 / 60 % 60);
        this.second = (int) (milliseconds / 1000 % 60);
        System.out.println(hour + " : " + minute + " : " + second);
    }

    public Time(long elapsedTime) {
        this.hour = (int) (elapsedTime / 1000 / 60 / 60 % 24);
        this.minute = (int) (elapsedTime / 1000 / 60 % 60);
        this.second = (int) (elapsedTime / 1000 % 60);
        System.out.println(hour + " : " + minute + " : " + second);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        System.out.println(hour + " : " + minute + " : " + second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        this.hour = (int) (elapseTime / 1000 / 60 / 60 % 24);
        this.minute = (int) (elapseTime / 1000 / 60 % 60);
        this.second = (int) (elapseTime / 1000 % 60);
        System.out.println(hour + " : " + minute + " : " + second);
    }
}
