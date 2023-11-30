package week_13.assignments.Question_13_15;


import java.math.BigInteger;

public class RationalBigInteger extends Number implements Comparable<RationalBigInteger> {
    private BigInteger numerator;
    private BigInteger denominator;


    public RationalBigInteger() {
        this(0, 1);
    }

    public RationalBigInteger(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        long n = (int) ((denominator > 0 ? 1 : -1) * numerator / gcd);
        long d = (int) (Math.abs(denominator / gcd));
        String nStr = "" + n;
        String dStr = "" + d;
        this.numerator = new BigInteger(nStr);
        this.denominator = new BigInteger(dStr);

    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator.longValue();
    }


    public long getDenominator() {
        return denominator.longValue();
    }

    public RationalBigInteger add(RationalBigInteger secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator() +
                denominator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new RationalBigInteger(n, d);
    }

    public RationalBigInteger subtract(RationalBigInteger secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator()
                - denominator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new RationalBigInteger(n, d);
    }

    public RationalBigInteger multiply(RationalBigInteger secondRational) {
        long n = numerator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new RationalBigInteger(n, d);
    }

    public RationalBigInteger divide(RationalBigInteger secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator();
        long d = denominator.longValue() * secondRational.numerator.longValue();
        return new RationalBigInteger(n, d);
    }

    @Override
    public String toString() {
        if (denominator.longValue() == 1)
            return numerator.longValue() + "";
        else
            return numerator.longValue() + "/" + denominator.longValue();
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if ((this.subtract((RationalBigInteger) (other))).getNumerator() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.longValue() * 1.0 / denominator.longValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(RationalBigInteger o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
