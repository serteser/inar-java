package week_11.assignments.Question_11_08;

import java.util.ArrayList;
import java.util.Date;

public class Transaction extends Account {
    private char type;
    private double amount;
    private String description;
    private Date dateCreated ;
    public Transaction(){

    }
//
//    public Transaction(char type, double amount, double balance, String description) {
//
//        super.setBalance(balance);
//        this.type = type;
//        this.amount = amount;
//        this.description = description;
//
//
//   }

    public Transaction(String name, int id, double balance, char type, double amount, String description) {

        this.type = type;
        this.amount = amount;
        this.description = description;
    }


//    public double getBalance() {
//        return super.getBalance();
//    }
//
//    @Override
//    public void setBalance(double balance) {
//        super.setBalance(balance);
//    }

//    public Date getDate() {
//        return super.getDateCreated();
//    }


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


//    public void withdraw(double amount) {
//        super.setBalance(super.getBalance() - amount);
//        Transaction transaction = new Transaction('W',amount, super.getBalance(), "Withdraw from ATM");
//        super.withdraw(transaction);
//
//
//    }


//    public void deposit(double amount) {
//        super.setBalance(super.getBalance() + amount);
//        Transaction transaction = new Transaction('D',amount, super.getBalance(), "Deposit to ATM");
//        super.deposit(transaction);
//    }
    @Override
    public String toString() {
        return  "Date: " + super.getDateCreated() +
                "\nTransaction type: " + ((type=='W') ? "Withdraw" : "Deposit") +
                "\nAmount: " + amount +
                "\nBalance: " + super.getBalance() +
                "\nDescription: " + description;
    }


}
