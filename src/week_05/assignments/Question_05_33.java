package week_05.assignments;

public class Question_05_33 {
    public static void main(String[] args) {
        int sumInitial = 0;
        int sum = sumInitial;
        int divisor =1;
        int divisorInitial =divisor;
        System.out.println("Perfect numbers are: ");
        for (int i = 2; i < 10000; i++) {
            for (divisor = 1; divisor <= i; divisor++) {

                if (i % divisor == 0) {
                    sum += divisor;

                    if ((sum == 2 * i)&&(divisor==i)) {

                        System.out.println(i);

                    }

                }

            }
            sum = sumInitial;
            divisor = divisorInitial;
        }
    }
}
