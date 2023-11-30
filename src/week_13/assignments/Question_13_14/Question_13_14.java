package week_13.assignments.Question_13_14;

public class Question_13_14 {
    public static void main(String[] args) {

        RationalArray r1 = new RationalArray(2, 1);
        RationalArray r2 = new RationalArray(2, 3);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
