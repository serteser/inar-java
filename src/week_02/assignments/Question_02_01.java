package week_02.assignments;

import java.util.Scanner;

public class Question_02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = (9 / 5.0) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}