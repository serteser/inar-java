package week_05.assignments;

public class Question_05_06 {
    public static void main(String[] args) {
        System.out.println("Miles           Kilometers     |     Kilometers           Miles");
        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {
            if (m < 7) {
                System.out.printf("%d %19.3f          |     %d %24.3f\n", m, m * 1.609, k, k / 1.609);
            } else if (m <= 7 && m < 10) {
                System.out.printf("%d %20.3f         |     %d %24.3f\n", m, m * 1.609, k, k / 1.609);
            } else if (7 < m && m <= 9) {
                System.out.printf("%d %20.3f         |     %d %24.3f\n", m, m * 1.609, k, k / 1.609);
            } else if (m == 10) {
                System.out.printf("%d %19.3f         |     %d %24.3f\n", m, m * 1.609, k, k / 1.609);
            }

        }
    }
}
