package week_06.assignments;

public class Question_06_14 {
    public static void main(String[] args) {
        final int NUMBER_OF_SUM_VALUES = 901;
        System.out.println("i            m(i)");
        System.out.println("--------------------");
        for (int i = 1; i <= NUMBER_OF_SUM_VALUES; i += 100) {
            System.out.printf("%-3d %15.4f", i, estimatedValueOfPi(i));
            System.out.println();
        }

    }

    public static double estimatedValueOfPi(int i) {
        double Pi;
        double sumNegative = 0;
        double sumPositive = 0;
        double j;
        for (j = 2; j <= i; j += 2) {
            sumNegative += ((Math.pow(1, (j + 1))) / ((2.0 * j) - 1));
        }
        for (j = 3; j <= i; j += 2) {
            sumPositive += ((Math.pow(1, (j + 1))) / ((2.0 * j) - 1));
        }
        Pi = 4 * ((1 + sumPositive) - sumNegative);

        return Pi;
    }

}
