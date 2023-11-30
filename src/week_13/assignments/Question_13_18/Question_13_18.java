package week_13.assignments.Question_13_18;


public class Question_13_18 {
    public static void main(String[] args) {


        Rational total = new Rational(0, 1);

        for (long i = 1, k = i + 1; i <= 99; i++, k++) {

            total = total.add(new Rational(i, k));
        }
        System.out.println(total);
    }
}
