package week_09.assignments.Question_09_11;

import java.util.Scanner;

public class Question_09_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
        System.out.println((equation.isSolvable() ? "x is " + equation.getX() + " and y is " + equation.getY() : "The equation has no solution"));
    }
}
