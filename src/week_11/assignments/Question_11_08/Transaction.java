package week_11.assignments.Question_11_08;

import java.util.ArrayList;
import java.util.Date;

public class Transaction extends Account {
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date date;
    public Transaction(){
        this.balance=super.getBalance();
    }

    public Transaction(char type, double amount, double balance, String description) {

        this.balance=balance;
        this.type = type;
        this.amount = amount;
        this.description = description;
        date=new Date();
        //super.setTransaction(new Transaction(type, amount, balance, description));
   }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double withdraw(double amount) {
        this.setBalance(balance - amount);
        super.setBalance(this.getBalance());
        //super.setTransaction(new Transaction(type, amount, balance, description));

        return this.getBalance();

    }

    @Override
    public double deposit(double amount) {
        super.setTransaction(new Transaction(type, amount, balance, description));
        super.setBalance(super.getBalance() + amount);
        return super.getBalance();
    }
    @Override
    public String toString() {
        return  "Date: " + date +
                "\nTransaction type: " + ((type=='W') ? "Withdraw" : "Deposit") +
                "\nAmount: " + amount +
                "\nBalance: " + balance +
                "\nDescription: " + description;
    }


}
