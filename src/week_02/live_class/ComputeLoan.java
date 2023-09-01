package week_02.live_class;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Please enter the number of years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Please enter the loan amount: ");
        double loanAmount = input.nextDouble();


        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is   $" + (int) (monthlyPayment*100)/100.0 + "the total payment is   $" + (int) (totalPayment*100)/100.0);
    }
}
