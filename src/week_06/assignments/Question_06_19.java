package week_06.assignments;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.println("The area of the triangle is " + area(side1, side2, side3));
        } else {
            System.out.print("invalid input!");
        }

    }

    public static double area(double side1, double side2, double side3) {
        double s;

        s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    public static boolean isValid(double side1, double side2, double side3) {
        boolean isValid = false;

        if (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1)) {
            isValid = true;
        }
        return isValid;
    }
}
