package week_11.assignments.Question_11_03;

public class Question_11_03 {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(11, 1450, -501);
        System.out.println(checkingAccount);
        System.out.println("-----------------------------------");
        SavingsAccount savingsAccount = new SavingsAccount(16, 4820);
        System.out.println(savingsAccount);

    }
}
