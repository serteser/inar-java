package week_05.assignments;

public class Question_05_25 {
    public static void main(String[] args) {
        double sumNegative = 0;
        double sumPositive = 0;
        for (double i = 2; i <= 10000; i += 2) {
            sumNegative += ((Math.pow(1, (i + 1))) / ((2.0 * i) - 1));
        }
        for (double i = 3; i <= 10000; i += 2) {
            sumPositive += ((Math.pow(1, (i + 1))) / ((2.0 * i) - 1));
        }
        double PI1 = 4 * ((1 + sumPositive) - sumNegative);
        System.out.println("PI value for i = 10000: " + PI1);
        sumNegative = 0;
        sumPositive = 0;
        for (double i = 2; i <= 20000; i += 2) {
            sumNegative += (Math.pow(1, (i + 1))) / ((2.0 * i) - 1);
        }
        for (double i = 3; i <= 20000; i += 2) {
            sumPositive += (Math.pow(1, (i + 1))) / ((2.0 * i) - 1);
        }
        double PI2 = 4 * ((1 + sumPositive) - sumNegative);
        System.out.println("PI value for i = 20000: " + PI2);
        sumNegative = 0;
        sumPositive = 0;
        for (double i = 2; i <= 100000; i += 2) {
            sumNegative += (Math.pow(1, (i + 1))) / ((2.0 * i) - 1);
        }
        for (double i = 3; i <= 100000; i += 2) {
            sumPositive += (Math.pow(1, (i + 1))) / ((2.0 * i) - 1);
        }
        double PI3 = 4 * ((1 + sumPositive) - sumNegative);
        System.out.println("PI value for i = 100000: " + PI3);
    }
}
