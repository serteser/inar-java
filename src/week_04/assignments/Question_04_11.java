package week_04.assignments;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();
        if (0 <= decimal && decimal <= 9) {
            System.out.println("The hex value is " + decimal);
        } else if (10 <= decimal && decimal <= 15) {
            decimal= decimal + 55;
            char ch = (char) decimal;
            System.out.println("The hex value is " +ch);
        } else {
            System.out.println(decimal + " is an invalid input");
        }
    }
}
