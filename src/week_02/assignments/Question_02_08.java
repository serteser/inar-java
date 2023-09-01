package week_02.assignments;

import java.util.*;

public class Question_02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long currentSeconds = (totalMilliseconds / 1000) % 60;
        long currentMinutes = ((totalMilliseconds / 1000) / 60) % 60;
        long currentHours = ((totalMilliseconds / 1000) / (60 * 60)) % 24;
        System.out.println("The current time is  " + (currentHours + gmt) + " : " + currentMinutes + " : " + currentSeconds);
    }
}
