package week_12.assignments.Question_12_04;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
//        this.annualInterestRate = annualInterestRate;
//        this.numberOfYears = numberOfYears;
//        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException { // Declaring an exception is optional here, since it is unchecked exception
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Wrong input! Please enter greater than 0 (zero)");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException { // Declaring an exception is optional here, since it is unchecked exception
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Wrong input! Please enter greater than 0 (zero)");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) throws IllegalArgumentException { // Declaring an exception is optional here, since it is unchecked exception
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Wrong input! Please enter greater than 0 (zero)");
        }
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
