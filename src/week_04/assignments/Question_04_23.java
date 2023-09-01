package week_04.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int workingHour = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();
        double grossPay = payRate * workingHour;
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;
        System.out.print("Employee Name: " + name + "\n" + "Hours Worked: " + workingHour + "\n" + "Pay Rate: $" + payRate + "\n" + "Gross Pay: $" + grossPay +
                "\n" + "Deductions: \n" + "\tFederal Withholding (20.0%): $" + federalWithholding + "\n" + "\tState Withholding (9.0%): $" + stateWithholding +
                "\n" + "\tTotal Deduction: $" + totalDeduction + "\n" + "Net Pay: $" + (int) (netPay * 100) / 100.0);
    }
}
