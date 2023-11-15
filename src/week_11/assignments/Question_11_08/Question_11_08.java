package week_11.assignments.Question_11_08;

public class Question_11_08 {
    public static void main(String[] args) {

        Account account = new Account();
        //Transaction transaction = new Transaction('W',30,1000,"withdraw from bank");
        Transaction transaction = new Transaction();
        account.setAnnualInterestRate(1.5);
        account.setName("George");
        account.setBalance(1000);
        account.setId(1122);
        System.out.println(account);
        transaction.withdraw(30);
        System.out.println(transaction);
        System.out.println(account);


    }
}
