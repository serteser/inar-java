package week_05.assignments;
import java.util.Scanner;
public class Question_05_30 {
    public static void main (String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter and amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g., 6): ");
        int months = input.nextInt();
        double i = amount;
        double savingAccount=0;

        for(int k=1; k<=months; k++,i=savingAccount+amount){
            savingAccount=(i*(annualInterestRate/1200))+i;

        }
        System.out.printf("Amount in savings account after %d months: $%6.2f",months, savingAccount);





    }
}
