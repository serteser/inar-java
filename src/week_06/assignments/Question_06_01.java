package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {

        System.out.println("The first 100 pentagonal numbers, ten per line: ");
        System.out.print(getPentagonalNumber(100));

    }

    public static int getPentagonalNumber(int n) {

        int pentagonalNumber = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {

            pentagonalNumber = (i * (3 * i - 1) / 2);

            count++;

            if (count % 10 == 0) {
                System.out.printf("%6d\n", pentagonalNumber);

            } else {
                System.out.printf("%6d", pentagonalNumber);
            }
        }
        return pentagonalNumber;
    }
}
