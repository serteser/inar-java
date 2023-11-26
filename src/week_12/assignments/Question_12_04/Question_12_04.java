package week_12.assignments.Question_12_04;

public class Question_12_04 {
    public static void main(String[] args) {

        Loan loan = new Loan();

        try {
            loan.setAnnualInterestRate(-2.5);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            loan.setLoanAmount(-3000);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            loan.setNumberOfYears(0);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
