package week_13.assignments.Question_13_15;

public class Question_13_15 {
    public static void main(String[] args) {

        RationalBigInteger r1 = new RationalBigInteger(5, 6);
        RationalBigInteger r2 = new RationalBigInteger(1, 4);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());

    }
}
