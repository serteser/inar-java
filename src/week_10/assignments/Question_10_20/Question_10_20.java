package week_10.assignments.Question_10_20;

import java.math.BigDecimal;

import java.math.RoundingMode;

public class Question_10_20 {
    public static void main(String[] args) {

        headerOfETable();
        approximateE();
    }

    public static void headerOfETable() {

        System.out.println("""
                                
                The e values for i = 100 to 1000:
                 i                   e
                ------------------------------------""");
    }

    public static BigDecimal factorial(int number) {
        BigDecimal n = BigDecimal.valueOf(number);
        BigDecimal result = BigDecimal.ONE;
        BigDecimal one = BigDecimal.ONE;
        for (int i = number; i >= 1; i--) {
            result = result.multiply(n);
            n = n.subtract(one);
        }
        return result;
    }

    public static void approximateE() {
        BigDecimal e;
        BigDecimal one = BigDecimal.ONE;
        for (int i = 100; i <= 1000; i += 100) {
            e = BigDecimal.ZERO;
            for (int j = 1; j <= i; j++) {
                e = e.add(one.divide(factorial(j), 25, RoundingMode.UP));
            }
            System.out.printf("%-5d", i);
            System.out.printf("%30.25f\n", e.add(one));

        }
    }
}
