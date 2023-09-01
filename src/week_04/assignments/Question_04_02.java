package week_04.assignments;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x1Radiant = Math.toRadians(x1);
        double y1Radiant = Math.toRadians(y1);

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x2Radiant = Math.toRadians(x2);
        double y2Radiant = Math.toRadians(y2);

        double distance = 6371.01 * Math.acos((Math.sin(x1Radiant) * Math.sin(x2Radiant)) +
                (Math.cos(x1Radiant) * Math.cos(x2Radiant) * Math.cos(y1Radiant - y2Radiant)));

        System.out.println("The distance between the two points is " + distance + " km");

    }
}
