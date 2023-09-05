package week_05.assignments;

public class Question_05_03 {
    public static void main(String[] args) {
        System.out.print("Kilograms    Pounds");

        for (int i = 1; i < 200; i++) {
            if (i % 2 != 0 && 1 <= i && i < 10) {
                System.out.printf("\n%d %17.1f", i, i * 2.2);
            } else if (i % 2 != 0 && 10 < i && i < 100) {
                System.out.printf("\n%d %16.1f", i, i * 2.2);
            } else if (i % 2 != 0 && 100 < i && i < 200) {
                System.out.printf("\n%d %15.1f", i, i * 2.2);
            }

        }
    }
}
