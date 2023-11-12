package week_11.assignments.Question_11_03;

import week_09.assignments.Question_09_07.Account;

public class SavingsAccount extends Account {
    public SavingsAccount(){

    }
    public SavingsAccount(int id, double balance){
        super(id, balance);
    }
    public String toString(){
        return "ID : " + super.getId() + "\nBalance is $" + super.getBalance();
    }
}
