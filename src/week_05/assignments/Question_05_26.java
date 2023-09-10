package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double ei = 0;
        double et = 1;
        double ep = 0;
        double i;
        double j;
        double capture;

        for (i = 1; i <= 10000; i++) {
            capture = i;
            for (j = 1; j <= (i - 1); i -= 2) {
                et *= 1.0 / (i * (i - 1));
            }
            i = capture;
            ep = et;
            et = 1;
            ei += ep;
        }
        System.out.println("e at i = 10000 is " + ((ei) + 1));
        ei = 0;
        et = 1;
        for (i = 1; i <= 20000; i++) {
            capture = i;
            for (j = 1; j <= (i - 1); i -= 2) {
                et *= 1.0 / (i * (i - 1));
            }
            i = capture;
            ep = et;
            et = 1;
            ei += ep;
        }
        System.out.println("e at i = 20000 is " + ((ei) + 1));
        ei = 0;
        et = 1;
        for (i = 1; i <= 100000; i++) {
            capture = i;
            for (j = 1; j <= (i - 1); i -= 2) {
                et *= 1.0 / (i * (i - 1));
            }
            i = capture;
            ep = et;
            et = 1;
            ei += ep;
        }
        System.out.println("e at i = 100000 is " + ((ei) + 1));
        System.out.println("Java's e is " + ((ei) + 1));
    }
}
