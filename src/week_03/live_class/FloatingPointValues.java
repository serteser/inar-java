package week_03.live_class;

public class FloatingPointValues {
    public static void main(String[] args) {
        final double EPSILON = 1E-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;

        if (Math.abs(x - 0.5) < EPSILON) {
            System.out.println(x + " is approximately 0.5");
            System.out.println(Math.abs(-6-8));
        }
    }
}
