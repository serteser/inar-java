package week_02.assignments;

import java.util.Scanner;

public class Question_02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double v = input.nextDouble(); // v is the take-off speed,
        double a = input.nextDouble(); // a is acceleration of airplane,
        double length = Math.pow(v, 2) / (2 * a);
        System.out.println("The minimum runway length for this airplane is " + (int) (length * 1000) / 1000.0);
    }
}
