package week_09.assignments.Question_09_10;

import java.util.Scanner;

public class Question_09_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        displayResult(equation);
    }

    public static void displayResult(QuadraticEquation e) {
        if (e.getDiscriminant() > 0) {
            System.out.printf("The equation has two roots %.3f and %.3f", e.getRoot1(), e.getRoot2());
        } else if (e.getDiscriminant() == 0) {
            System.out.printf("The equation has one root %.1f", e.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
