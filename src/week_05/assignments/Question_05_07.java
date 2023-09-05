package week_05.assignments;

public class Question_05_07 {
    public static void main(String[] args) {
        double tuition = 10000;
        double tuitionIncrementRatePerYear = 5 / 100.0;
        double totalCost1 = 0;
        double totalCost2 = 0;
        double totalCost3 = 0;
        double totalCost4 = 0;
        double totalCost = 0;

        for (int year = 1; year <= 14; year++) {
            if (1 <= year && year <= 10) {
                tuition += (int) (tuition * tuitionIncrementRatePerYear);
            } else if (10 < year && year <= 11) {
                totalCost1 = tuition + (int) (tuition * tuitionIncrementRatePerYear);
            } else if (11 < year && year <= 12) {
                totalCost2 = totalCost1 + (int) (totalCost1 * tuitionIncrementRatePerYear);
            } else if (12 < year && year <= 13) {
                totalCost3 = totalCost2 + (int) (totalCost2 * tuitionIncrementRatePerYear);
            } else if (13 < year && year <= 14) {
                totalCost4 = totalCost3 + (int) (totalCost3 * tuitionIncrementRatePerYear);
            }

        }
        totalCost = totalCost1 + totalCost2 + totalCost3 + totalCost4;
        System.out.printf("Tuition in ten years: $%.0f\n", tuition);
        System.out.printf("Total cost for four years' worth of tuition after the tenth year: $%.0f", totalCost);
    }


}
