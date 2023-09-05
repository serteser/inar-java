package week_05.assignments;

public class Question_05_04 {
    public static void main(String[] args) {
        final double KILOMETERS = 1.609;
        System.out.print("Miles           Kilometers");

        for (int i = 1; i <= 10; i++) {
            if (i < 7) {
                System.out.printf("\n%d %19.3f", i, i * KILOMETERS);
            } else if (7 <= i && i < 10) {
                System.out.printf("\n%d %20.3f", i, i * KILOMETERS);
            } else if (i == 10) {
                System.out.printf("\n%d %19.3f", i, i * KILOMETERS);
            }

        }
    }
}
