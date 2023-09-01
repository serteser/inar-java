package week_04.live_class;

public class FormattingConsoleOutput {
    public static void main(String[] args) {
        String live = "The life is full of mystery.";
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.printf("Interest is $%4.2f",interest);
        int count = 15;
        amount =45.56;
        System.out.printf("\ncount is %d ", count);


    }
}
