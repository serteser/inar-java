package week_11.assignments.Question_11_01;

import week_11.live_class.GeometricObject.SimpleGeometricObject;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {

        getInputsAndDisplayResult();

    }

    public static void getInputsAndDisplayResult() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter a color: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true/false) ? ");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3);
        SimpleGeometricObject object = new SimpleGeometricObject();
        object.setColor(color);
        object.setFilled(filled);
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + object.getColor());
        System.out.println("Triangle is" + (object.isFilled() ? " filled." : " not filled."));
    }

}
