package week_13.assignments.Question_13_18;


import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger numerator;
    private BigInteger denominator;


    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
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

    public Rational add(Rational secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator() +
                denominator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator()
                - denominator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = numerator.longValue() * secondRational.getNumerator();
        long d = denominator.longValue() * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = numerator.longValue() * secondRational.getDenominator();
        long d = denominator.longValue() * secondRational.numerator.longValue();
        return new Rational(n, d);
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
        if ((this.subtract((Rational) (other))).getNumerator() == 0)
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
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
