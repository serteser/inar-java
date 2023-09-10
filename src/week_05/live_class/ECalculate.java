package week_05.live_class;

public class ECalculate {
    public static void main(String[] args) {
        int n = 10; // Change 'n' to the desired number of terms in the series
        double e = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            e += 1.0 / factorial;
        }

        System.out.println("The value of e for " + n + " terms is: " + e);
    }
}
