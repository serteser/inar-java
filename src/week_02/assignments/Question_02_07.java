package week_02.assignments;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();
        int year = minutes / (365 * 24 * 60);
        int remainingMinutes = minutes % (365 * 24 * 60);
        int days = remainingMinutes / (24 * 60);
        System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days");


    }
}