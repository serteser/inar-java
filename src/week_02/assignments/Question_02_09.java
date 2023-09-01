package week_02.assignments;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1, and t :");
        double v0; // starting velocity
        double v1; // ending velocity
        double t; // time span in seconds
        double a; // average acceleration
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();
        a = (v1 - v0) / t;
        System.out.println("The average acceleration is  " + ((int) (a * 10000)) / 10000.0);


    }
}
