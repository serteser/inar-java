package week_11.assignments.Question_11_03;

import week_09.assignments.Question_09_07.Account;

public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount() {

    }

    public CheckingAccount(int id, double balance, double limit) {
        super(id, balance);
        if (isLimitAcceptable(limit)) {
            this.limit = limit;
        } else {
            System.out.println("$" + limit + " invalid limit setting!");
            this.limit = -500;
        }

    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        if (isLimitAcceptable(limit)) {
            this.limit = limit;
        } else {
            System.out.println("$" + limit + " invalid limit setting!");
        }
    }

    public boolean isLimitAcceptable(double limit) {
        return limit >= -500;
    }

    public String toString() {
        return "ID : " + super.getId() + "\nBalance is $" + super.getBalance() + "\nLimit is $" + limit;
    }
}
