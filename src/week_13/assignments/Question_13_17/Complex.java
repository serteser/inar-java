package week_13.assignments.Question_13_17;

public class Complex implements Cloneable {
    private final double[] complex;

    public Complex() {

        this(1, 1);
    }

    public Complex(double a) {

        complex = new double[2];
        this.complex[0] = a;
        this.complex[1] = 0;
    }

    public Complex(double a, double b) {

        complex = new double[2];
        this.complex[0] = a;
        this.complex[1] = b;
    }

    public String add(Complex c) {

        double realPart = this.getRealPart() + c.getRealPart();
        double imaginaryPart = this.getImaginaryPart() + c.getImaginaryPart();
        return realPart + " + " + imaginaryPart + "i";
    }

    public String subtract(Complex c) {

        double realPart = this.getRealPart() - c.getRealPart();
        double imaginaryPart = this.getImaginaryPart() - c.getImaginaryPart();
        return realPart + " + " + imaginaryPart + "i";
    }

    public String multiply(Complex c) {

        double realPart = this.getRealPart() * c.getRealPart() - this.getImaginaryPart() * c.getImaginaryPart();
        double imaginaryPart = this.getImaginaryPart() * c.getRealPart() + this.getRealPart() * c.getImaginaryPart();
        return realPart + " + " + imaginaryPart + "i";
    }

    public String divide(Complex c) {

        double realPart = ((this.getRealPart() * c.getRealPart() + this.getImaginaryPart() * c.getImaginaryPart()) /
                ((c.getRealPart() * c.getRealPart()) + c.getImaginaryPart() * c.getImaginaryPart()));
        double imaginaryPart = ((this.getImaginaryPart() * c.getRealPart() - this.getRealPart() * c.getImaginaryPart()) /
                ((c.getRealPart() * c.getRealPart()) + c.getImaginaryPart() * c.getImaginaryPart()));
        return realPart + " + " + imaginaryPart + "i";
    }

    public double abs() {
        return Math.sqrt(this.getRealPart() * this.getRealPart() + this.getImaginaryPart() * this.getImaginaryPart());
    }

    public double getRealPart() {
        return this.complex[0];
    }

    public double getImaginaryPart() {
        return this.complex[1];
    }

    @Override
    public String toString() {
        return this.complex[0] + " + " + this.complex[1] + "i";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
