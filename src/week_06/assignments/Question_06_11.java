package week_06.assignments;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("SalesAmount          Commission");
        for (int i = 1; i <= 31; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (double i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-6.0f %22.1f", i, computeCommission(i));
            System.out.println();
        }

    }

    public static double computeCommission(double salesAmount) {
        boolean isExistingAmount = true;
        double commission = 0;
        while (isExistingAmount) {
            if (salesAmount <= 5000) {
                commission = salesAmount * 0.08;
            } else if (5000 < salesAmount && salesAmount <= 10000) {
                commission = ((salesAmount - 5000) * 0.1) + (5000 * 0.08);

            } else {
                commission = ((salesAmount - 10000) * 0.12) + (5000 * 0.1) + (5000 * 0.08);
            }
            isExistingAmount = false;

        }
        return commission;
    }

}
