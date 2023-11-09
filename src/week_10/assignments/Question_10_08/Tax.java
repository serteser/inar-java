package week_10.assignments.Question_10_08;

public class Tax {
    public static int SINGLE_FILER = 0;
    public static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static int MARRIED_SEPARATELY = 2;
    public static int HEAD_OF_HOUSEHOLD = 3;
    int[][] brackets;
    double[] rates;
    double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        switch (filingStatus) {
            case 0:
                this.SINGLE_FILER = filingStatus;
            case 1:
                this.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = filingStatus;
            case 2:
                this.MARRIED_SEPARATELY = filingStatus;
            case 3:
                this.HEAD_OF_HOUSEHOLD = filingStatus;
        }
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax(double[] rates, int[][] brackets, int status, int taxableIncome) {
        this.brackets=brackets;
        this.rates=rates;
        this.taxableIncome=taxableIncome;
        double taxRate = startingTaxRate(brackets, taxableIncome, status);
        double maxPartOfTaxableIncome = Math.abs(taxableIncome - brackets[status][(int) (taxRate)]) * rates[(int) (taxRate + 1)];
        double mainPartOfTaxableIncome = 0;
        for (int column = 0; column <= (int) taxRate; column++) {
            if (column != 0) {
                mainPartOfTaxableIncome += (brackets[status][column] - brackets[status][column - 1]) * rates[column];
            } else {
                mainPartOfTaxableIncome += brackets[status][0] * rates[0];
            }
        }
        return mainPartOfTaxableIncome + maxPartOfTaxableIncome;

    }

    public static double startingTaxRate(int[][] brackets, int taxableIncome, int status) {
        int column;
        for (column = brackets[0].length - 1; column > 0; column--) {
            if (taxableIncome >= brackets[status][column]) {
                return column;
            }
        }

        return column;
    }
}
