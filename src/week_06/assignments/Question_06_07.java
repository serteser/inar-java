package week_06.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("The annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200.0;
        System.out.print("The number of years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Years   Future Value");
        System.out.println(futureInvestmentValue(investmentAmount, monthlyInterestRate, numberOfYears));
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        double result = 0;

        for (int i = 1; i <= numberOfYears; i++) {

            result = investmentAmount * Math.pow((1 + monthlyInterestRate), (i * 12));

            System.out.printf("%2d      %8.2f\n", i, result);
        }
        return result;
    }
}
