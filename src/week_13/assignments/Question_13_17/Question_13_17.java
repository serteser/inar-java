package week_13.assignments.Question_13_17;

import java.util.Scanner;

public class Question_13_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double firstReal = input.nextDouble();
        double firstImaginary = input.nextDouble();
        System.out.print("Enter the second complex number: ");
        double secondReal = input.nextDouble();
        double secondImaginary = input.nextDouble();
        Complex first = new Complex(firstReal, firstImaginary);
        Complex second = new Complex(secondReal, secondImaginary);

        System.out.println("(" + first + ")" + " + " + "(" + second + ")" + " = " + first.add(second));
        System.out.println("(" + first + ")" + " - " + "(" + second + ")" + " = " + first.subtract(second));
        System.out.println("(" + first + ")" + " * " + "(" + second + ")" + " = " + first.multiply(second));
        System.out.println("(" + first + ")" + " / " + "(" + second + ")" + " = " + first.divide(second));
        System.out.println("|" + "(" + first + ")" + "|" + " = " + first.abs());
    }
}
