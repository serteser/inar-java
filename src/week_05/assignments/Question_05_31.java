package week_05.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount (e.g., 10000): ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield (e.g., 5.75): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();
        double i = amount;
        double savingAccount = 0;

        System.out.println("Month CD Value");
        for (int k = 1; k <= months; k++, i = savingAccount) {
            savingAccount = (i * (annualInterestRate / 1200)) + i;
            System.out.printf("%d %8.2f\n",k, savingAccount);
        }

    }
}
