package week_11.assignments.Question_11_06;

import java.util.Date;

public class Loan  {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date date;

    public Loan() {
        this(1, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        date=new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public Date getDate(){
        return date;
    }
    @Override
    public String toString(){
        return "Annual Interest Rate: " + getAnnualInterestRate() +
                "\nNumber of Years: " + getNumberOfYears() +
                "\nLoan Amount: " + getLoanAmount() +
                "\nLoan Date: " + getDate();
    }
}
