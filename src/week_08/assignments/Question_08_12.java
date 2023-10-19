package week_08.assignments;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {

        // Get the input
        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), \n2-married separately, 3-head of household) Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        int taxableIncome = input.nextInt();

        // Create array and matrix
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        // Display the result
        System.out.printf("Tax is $%.2f\n", tax(rates, brackets, status, taxableIncome));
    }

    // Calculate the tax
    public static double tax(double[] rates, int[][] brackets, int status, int taxableIncome) {
        double taxRate = startingTaxRate(brackets, taxableIncome, status);
        double maxPartOfTaxableIncome = Math.abs(taxableIncome - brackets[status][(int) (taxRate)]) * rates[(int) (taxRate + 1)];
        double mainPartOfTaxableIncome = 0;
        for (int column = 0; column <= (int) taxRate; column++) {
            if (column != 0) {
                mainPartOfTaxableIncome += (brackets[status][column] - brackets[status][column - 1]) * rates[column];
            } else {
                mainPartOfTaxableIncome += brackets[status][0] * rates[0];
            }
        }
        return mainPartOfTaxableIncome + maxPartOfTaxableIncome;
    }


    // Determine the tax rate that shows you where you must start to calculate
    public static double startingTaxRate(int[][] brackets, int taxableIncome, int status) {
        int column;
        for (column = brackets[0].length - 1; column > 0; column--) {
            if (taxableIncome >= brackets[status][column]) {
                return column;
            }
        }

        return column;
    }
}
