package week_06.assignments;

public class Question_06_17 {
    public static void main(String[] args) {
        printMatrix(3);
    }

    public static void printMatrix(int n) {
        int zeroOrOne;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                zeroOrOne = (int) (Math.random() * 2);
                System.out.print(zeroOrOne + " ");
            }
            System.out.println();

        }

    }

}
