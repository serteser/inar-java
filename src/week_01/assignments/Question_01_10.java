package week_01.assignments;

public class Question_01_10 {
    public static void main(String[] args) {
        /*
        (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that
        displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
         */
        System.out.println("Distance in kilometers:");
        System.out.println("14.0");
        System.out.println("Time in minutes:");
        System.out.println("45.5");
        System.out.println("Average speed in miles per hour:");
        System.out.println((double) (14 / 1.6) / (double) (45.5 / 60));
    }
}
