package week_06.assignments;

public class Question_06_13 {
    public static void main(String[] args) {
        final int NUMBER_OF_SUM_VALUES = 20;
        System.out.println("i            m(i)");
        System.out.println("------------------");
        for (int i = 1; i <= NUMBER_OF_SUM_VALUES; i++) {
            System.out.printf("%-2d %15.4f\n", i, sumSeries(i));
        }

    }

    public static double sumSeries(int number) {
        double result = 0;
        for (int i = 1; i <= number; i++) {
            result += i / (i + 1.0);
        }
        return result;
    }
}
