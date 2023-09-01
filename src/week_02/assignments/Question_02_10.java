package week_02.assignments;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");

        double M; // Weight of water in kilograms
        M = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        double Q; // Energy, measured in joules
        Q = M * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + ((int) (Q * 10)) / 10.0);

    }
}
