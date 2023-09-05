package week_05.assignments;

public class Question_05_10 {
    public static void main(String[] args) {
        for (int i = 100; i <= 400; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.printf("%4d", i);
            }
        }
        System.out.println();
        for (int i = 400; i <= 700; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.printf("%4d", i);
            }
        }
        System.out.println();
        for (int i = 700; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.printf("%4d", i);
            }
        }
    }
}
















