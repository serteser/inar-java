package week_06.assignments;

public class Question_06_15 {
    public static void main(String[] args) {
        System.out.printf("\n%s %15s %22s %12s %18s\n%s %39s %13s %17s\n%42s\n", "Taxable", "Single", "Married Joint", "Married",
                "Head of", "Income", "or Qualifying", "Separate", "a House", "Widow(er)");
        System.out.println("--------------------------------------------------------------------------------");
        for (double i = 50000; i <= 60000; i += 50) {
            System.out.printf("%.0f", i);
            for (int j = 0; j <= 3; j++) {
                System.out.printf("%17d ", Math.round(computeTax(j, i)));
            }
            System.out.println();
        }

    }

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;

        if (status == 0) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 33950) {
                tax = ((taxableIncome - 8350) * (15 / 100.0)) + (8350 * 0.10);
            } else if (taxableIncome <= 82250) {
                tax = ((taxableIncome - 33950) * (25 / 100.0)) + ((33950 - 8350) * (15 / 100.0)) + (8350 * 0.10);
            } else if (taxableIncome <= 171550) {
                tax = (taxableIncome - 82250) * (28 / 100.0) + ((82250 - 33950) * (25 / 100.0)) + ((33950 - 8350) * (15 / 100.0)) + (8350 * 0.10);
            } else if (taxableIncome <= 372950) {
                tax = ((taxableIncome - 171550) * (33 / 100.0)) + ((171550 - 82250) * (28 / 100.0)) + ((82250 - 33950) * (25 / 100.0)) + ((33950 - 8350) * (15 / 100.0)) + (8350 * 0.10);
            } else if (taxableIncome > 372950) {
                tax = ((taxableIncome - 372950) * (35 / 100.0)) + ((372950 - 171550) * (33 / 100.0)) + ((171550 - 82250) * (28 / 100.0)) + ((82250 - 33950) * (25 / 100.0)) + ((33950 - 8350) * (15 / 100.0)) + (8350 * 0.10);
            }
        }
        if (status == 1) {
            if (taxableIncome <= 16700) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 67900) {
                tax = ((taxableIncome - 16700) * (15 / 100.0)) + (16700 * 0.10);
            } else if (taxableIncome <= 137050) {
                tax = ((taxableIncome - 67900) * (25 / 100.0)) + ((67900 - 16700) * (15 / 100.0)) + (16700 * 0.10);
            } else if (taxableIncome <= 208850) {
                tax = (taxableIncome - 137050) * (28 / 100.0) + ((137050 - 67900) * (25 / 100.0)) + ((67900 - 16700) * (15 / 100.0)) + (16700 * 0.10);
            } else if (taxableIncome <= 372950) {
                tax = ((taxableIncome - 208850) * (33 / 100.0)) + ((208850 - 137050) * (28 / 100.0)) + ((137050 - 67900) * (25 / 100.0)) + ((67900 - 16700) * (15 / 100.0)) + (16700 * 0.10);
            } else if (taxableIncome > 372950) {
                tax = ((taxableIncome - 372950) * (35 / 100.0)) + ((372950 - 208850) * (33 / 100.0)) + ((208850 - 137050) * (28 / 100.0)) + ((137050 - 67900) * (25 / 100.0)) + ((67900 - 16700) * (15 / 100.0)) + (16700 * 0.10);
            }
        }
        if (status == 2) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 33950) {
                tax = ((taxableIncome - 8350) * (15 / 100.0)) + (8350 * 0.10);
            } else if (taxableIncome <= 68525) {
                tax = ((taxableIncome - 33950) * (25 / 100.0)) + ((33950 - 8350) * (15 / 100.0)) + (8350 * 0.10);
            } else if (taxableIncome <= 104425) {
                tax = (taxableIncome - 68525) * (28 / 100.0) + ((68525 - 33950) * (25 / 100.0)) + ((33950 - 8350) * (15 / 100.0)) + (8350 * 0.10);
            } else if (taxableIncome <= 186475) {
                tax = ((taxableIncome - 104425) * (33 / 100.0)) + ((104425 - 68525) * (28 / 100.0)) + ((68525 - 33950) * (25 / 100.0)) + ((33950 - 8350) * (15 / 100.0)) + (8350 * 0.10);
            } else if (taxableIncome > 186475) {
                tax = ((taxableIncome - 186475) * (35 / 100.0)) + ((186475 - 104425) * (33 / 100.0)) + ((104425 - 68525) * (28 / 100.0)) + ((68525 - 33950) * (25 / 100.0)) + ((33950 - 8350) * (15 / 100.0)) + (8350 * 0.10);
            }
        }
        if (status == 3) {
            if (taxableIncome <= 11950) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 45500) {
                tax = ((taxableIncome - 11950) * (15 / 100.0)) + (11950 * 0.10);
            } else if (taxableIncome <= 117450) {
                tax = ((taxableIncome - 45500) * (25 / 100.0)) + ((45500 - 11950) * (15 / 100.0)) + (11950 * 0.10);
            } else if (taxableIncome <= 190200) {
                tax = (taxableIncome - 117450) * (28 / 100.0) + ((117450 - 45500) * (25 / 100.0)) + ((45500 - 11950) * (15 / 100.0)) + (11950 * 0.10);
            } else if (taxableIncome <= 372950) {
                tax = ((taxableIncome - 190200) * (33 / 100.0)) + ((190200 - 117450) * (28 / 100.0)) + ((117450 - 45500) * (25 / 100.0)) + ((45500 - 11950) * (15 / 100.0)) + (11950 * 0.10);
            } else if (taxableIncome > 372950) {
                tax = ((taxableIncome - 372950) * (35 / 100.0)) + ((372950 - 190200) * (33 / 100.0)) + ((190200 - 117450) * (28 / 100.0)) + ((117450 - 45500) * (25 / 100.0)) + ((45500 - 11950) * (15 / 100.0)) + (11950 * 0.10);
            }
        }
        return tax;
    }
}
