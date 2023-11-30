package week_13.assignments.Question_13_14;

public class RationalArray extends Number implements Comparable<RationalArray> {

    private long[] r = new long[2];


    public RationalArray() {
        this(0, 1);
    }

    public RationalArray(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        long n = (denominator > 0 ? 1 : -1) * numerator / gcd;
        long d = Math.abs(denominator / gcd);
        r[0] = n;
        r[1] = d;
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
        return r[0];
    }


    public long getDenominator() {
        return r[1];
    }

    public RationalArray add(RationalArray secondRational) {
        long n = r[0] * secondRational.getDenominator() +
                r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new RationalArray(n, d);
    }

    public RationalArray subtract(RationalArray secondRational) {
        long n = r[0] * secondRational.getDenominator()
                - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new RationalArray(n, d);
    }

    public RationalArray multiply(RationalArray secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new RationalArray(n, d);
    }

    public RationalArray divide(RationalArray secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.r[0];
        return new RationalArray(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if ((this.subtract((RationalArray) (other))).getNumerator() == 0)
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
        return r[0] * 1.0 / r[1];
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(RationalArray o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }

}
