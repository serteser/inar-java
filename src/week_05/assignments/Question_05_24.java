package week_05.assignments;

public class Question_05_24 {
    public static void main(String[] args) {
        double i;
        double n;
        double sum = 0;

        for (i = 1, n = 2; n <= 98; n += 2) {
            sum += ((i + n) - 2) / (i + n);
        }
        System.out.print("Sum of series: " + sum);
    }
}
