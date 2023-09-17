package week_06.assignments;

public class Question_06_09 {
    public static void main(String[] args) {
        final double FOOT = 1;
        final double METER = 20;

        System.out.println("Feet         Meters        |       Meters        Feet");
        for (int i = 1; i <= 55; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (double i = FOOT, j = METER; i <= 10.00 && j <= 65.00; i++, j += 5) {
            System.out.printf("%4.1f         %5.3f         |", i, footToMeter(i));
            System.out.printf("       %5.1f         %5.3f         ", j, meterToFoot(j));
            System.out.println();
        }

    }

    public static double footToMeter(double foot) {
        double result;
        result = (int) ((0.305 * foot) * 1000) / 1000.0;
        return result;
    }

    public static double meterToFoot(double meter) {
        double result;
        result = (int) ((3.279 * meter) * 1000) / 1000.0;
        return result;
    }
}
