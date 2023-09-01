package week_02.assignments;

import java.util.Scanner;

public class Question_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pound = input.nextDouble();
        double kilogram = pound * 0.4535_9237;
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();
        double meter = inches * 0.0254;
        double bodyMassIndex = kilogram / Math.pow(meter, 2); // bodyMassIndex (BMI)
        System.out.println("BMI is " + ((int) (bodyMassIndex * 10000) / 10000.0));


    }
}
