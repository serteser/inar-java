package week_05.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double balance = input.nextDouble();
        System.out.print("Number of Years: ");
        double numberOfYears = input.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Monthly Payment: ");
        double monthlyPayment = input.nextDouble();
        System.out.print("Total Payment: ");
        double totalPayment = input.nextDouble();

        System.out.println("\nPayment#    Interest        Principal       Balance");

        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = (0.005833) * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t\t" + (int) (interest * 100) / 100.0 + "\t\t\t" + (int) (principal * 100) / 100.0 + "\t\t\t" + (int) (balance * 100) / 100.0);
        }
    }
}
