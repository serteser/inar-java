package week_06.assignments;

public class Question_06_08 {
    public static void main(String[] args) {
        final double CELSIUS = 40;
        final double FAHRENHEIT = 120;

        System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius");
        for (int i = 1; i <= 55; i++) {
            System.out.print("-");
        }
        System.out.println();


        for (double i = CELSIUS, j = FAHRENHEIT; i >= 31.00 && j >= 30.00; i--, j -= 10) {
            System.out.printf("%4.1f         %-5.1f         |", i, celsiusToFahrenheit(i));
            System.out.printf("       %-5.1f         %-5.2f         ", j, fahrenheitToCelsius(j));
            System.out.println();
        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        double result;
        result = (int) ((((9.0 / 5) * celsius) + 32) * 100) / 100.0;
        return result;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double result;
        result = (int) (((5.0 / 9) * (fahrenheit - 32)) * 100) / 100.0;
        return result;
    }
}
