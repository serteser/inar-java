package week_09.assignments.Question_09_11;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    public LinearEquation(){} // This constructor has been added afterward to enhance the readability of question number 09_12

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return ((getA() * getD()) - (getB() * getC())) != 0;
    }

    public double getX() {
        return ((getE() * getD()) - (getB() * getF())) / ((getA() * getD()) - (getB() * getC()));
    }

    public double getY() {
        return ((getA() * getF()) - (getE() * getC())) / ((getA() * getD()) - (getB() * getC()));
    }

}