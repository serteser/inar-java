package week_05.assignments;

public class Question_05_11 {
    public static void main(String[] args) {
        for (int i = 100; i <= 131; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.printf("%4d", i);
            }
        }
        System.out.println();
        for (int i = 131; i <= 163; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.printf("%4d", i);
            }
        }
        System.out.println();
        for (int i = 163; i <= 196; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.printf("%4d", i);
            }
        }
        System.out.println();
        for (int i = 196; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.printf("%4d", i);
            }
        }
    }
}
