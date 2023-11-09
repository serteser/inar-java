package week_10.assignments.Question_10_08;

public class Question_10_08 {
    public static void main(String[] args) {

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household


        };
                    Tax tax  = new Tax();

                    displayResult(tax,rates,brackets);
    }
    public static void displayResult(Tax tax,double[] rates,int[][] brackets){

        System.out.println("\n\t\t\t\t\t\t2009 Taxes\nIncome    Status 0      Status 1      Status 2      Status 3" +
                "\n------------------------------------------------------------");
        for (int i = 50_000; i <=60_000 ; i+=1000) {

                System.out.printf("%d     %-9.2f     %-9.2f     %-9.2f     %-9.2f",i, tax.getTax(rates, brackets, 0, i),
                        tax.getTax(rates, brackets, 1, i),tax.getTax(rates, brackets, 2, i),tax.getTax(rates, brackets, 3, i));

            System.out.println();
        }
    }
}
