package week_02.assignments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        final double TOTAL_SECONDS_IN_ONE_YEAR = 365 * 24 * 60 * 60;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();
        double population = 312_032_486 + (TOTAL_SECONDS_IN_ONE_YEAR * numberOfYears * (1 / 7.0 - 1 / 13.0 + 1 / 45.0));
        System.out.println("The population in " + numberOfYears + " years is " + (int) (population) );
    }
}
