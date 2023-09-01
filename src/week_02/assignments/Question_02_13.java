package week_02.assignments;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        savingAmount = savingAmount + (savingAmount * 0.00417);
        savingAmount = (savingAmount + 100) + ((savingAmount + 100) * 0.00417);
        savingAmount = (savingAmount + 100) + ((savingAmount + 100) * 0.00417);
        savingAmount = (savingAmount + 100) + ((savingAmount + 100) * 0.00417);
        savingAmount = (savingAmount + 100) + ((savingAmount + 100) * 0.00417);
        double accountValue = (savingAmount + 100) + ((savingAmount + 100) * 0.00417);
        System.out.println("After the sixth month, the account value is " + (int) (accountValue * 100) / 100.0); // sixth

    }
}
