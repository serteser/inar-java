package week_04.assignments;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble(); // "r" is length from center to vertex.
        double s = 2 * r * Math.sin(Math.PI / 5); // "s" the length of each side of the pentagon
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.println("The area of the pentagon is " + Math.round(area * 100) / 100.0);


    }

}
