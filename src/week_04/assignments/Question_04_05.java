package week_04.assignments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sideNumber = input.nextInt();
        System.out.print("Enter the length of a side: ");
        double sideLength = input.nextDouble();

        double area = (sideNumber * Math.pow(sideLength, 2)) / (4 * (Math.tan(Math.PI / sideNumber)));

        System.out.println("The area of the polygon is " + area);
    }
}
