package week_12.assignments.Question_12_05;

import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);

            System.out.printf("Triangle: side1 = %.1f side2 = %.1f side3 = %.1f\n", triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
            System.out.printf("Perimeter of triangle is %.1f\n", triangle.getPerimeter());
            System.out.printf("Area of the triangle is %.1f\n", triangle.getArea());
        } catch (IllegalTriangleException e) {
            System.out.println(e + " The sum of any two sides must be greater than the remaining side" );
            throw new IllegalTriangleException();
        }
    }
}
