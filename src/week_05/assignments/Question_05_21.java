package week_05.assignments;
import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years : ");
        double years = input.nextDouble();
        double sir = 5 / 100.0; // Starting Interest Rate
        double eir = 8.01 / 100; // Ending Interest Rate

        System.out.print("Interest Rate          Monthly Payment          Total Payment\n");

        for (sir = 5 / 100.0; sir <= eir; sir += 0.00125) {
            double monthlyInterestRate = sir / 12;
            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1 + monthlyInterestRate), (years * 12))));
            double totalPayment = monthlyPayment * years * 12;

            System.out.printf("%5.3f%% %22.2f %26.2f\n", (sir * 100), monthlyPayment, totalPayment);
        }

    }
}
