package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {

        System.out.println("The first 100 pentagonal numbers, ten per line: ");
        int pentagonalNumber;
        int count = 0;
        int n = 100;

        for (int i = 1; i <= n; i++) {

            pentagonalNumber = getPentagonalNumber(i);

            count++;

            if (count % 10 == 0) {
                System.out.printf("%6d\n", pentagonalNumber);

            } else {
                System.out.printf("%6d", pentagonalNumber);
            }
        }



    }
    public static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1)) / 2;
    }

}
