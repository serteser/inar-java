package week_05.assignments;

public class Question_05_05 {
    public static void main(String[] args) {
        System.out.print("Kilograms     Pounds     |     Pounds     Kilograms");

        for (int i = 1, j = 20; i < 200 && j <= 515; i += 2, j += 5) {
            if ((i % 2 != 0 && 1 <= i && i < 10 && j % 5 == 0)) {
                System.out.printf("\n%d %18.1f     |     %d%18.2f", i, i * 2.2, j, j / 2.2);

            } else if (i % 2 != 0 && 10 < i && i < 100 && j % 5 == 0) {
                System.out.printf("\n%d %17.1f     |     %d %17.2f", i, i * 2.2, j, j / 2.2);

            } else if (i % 2 != 0 && 100 < i && i < 200 && j % 5 == 0) {
                System.out.printf("\n%d %16.1f     |     %d %17.2f", i, i * 2.2, j, j / 2.2);
            }

        }
    }
}
