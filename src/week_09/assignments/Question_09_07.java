package week_09.assignments;

public class Question_09_07 {
    public static void main(String[] args) {

        Account myAccount = new Account(1122, 20000);
        myAccount.setAnnualInterestRate(4.5);
        myAccount.withdraw(2500);
        myAccount.deposit(3000);

        umlDraw(myAccount);
    }

    public static void umlDraw(Account a) {
        System.out.println("\n\t\tAccount Statement :");
        System.out.println("----------------------------------");
        System.out.printf("Account ID      : %d\nDate created    : %s\nBalance         : $%8.2f\nMonthly Interest: $%.2f"
                , a.getId(), a.getDateCreated(), a.getBalance(), a.getMonthlyInterest());
    }
}
