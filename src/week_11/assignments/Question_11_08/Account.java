package week_11.assignments.Question_11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name; // name of customer
    private int id;
    private  double balance;
    private double annualInterestRate;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private Date dateCreated;

    public Account() {

        dateCreated = new Date();

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();

    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(Transaction transaction) {

        transactions.add(transaction);

    }

    public void deposit(Transaction transaction) {

        transactions.add(transaction);

    }

    public void setTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nID: " + id +
                "\nBalance: " + balance;
    }

    public void displayTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.print(transactions.get(i) + " ");
        }
    }

}
