package week_13.assignments.Question_13_01;

import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.print("Enter three sides of the triangle: ");
        triangle.setSide1(input.nextDouble());
        triangle.setSide2(input.nextDouble());
        triangle.setSide3(input.nextDouble());
        System.out.println("Enter the color : ");
        triangle.setColor(input.next());
        System.out.println("Enter : isFilled ? true or false :");
        triangle.setFilled(input.nextBoolean());

        System.out.println(triangle);

    }
}
