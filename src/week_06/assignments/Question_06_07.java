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
        double result;
        for (int i = 1; i <= numberOfYears; i++) {

            result = futureInvestmentValue( investmentAmount, monthlyInterestRate, i);

            System.out.printf("%2d      %8.2f\n", i, result);
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        double result;
            result = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));
        return result;
    }
}
