package week_03.assignments;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lottery pick (three digits): ");
        int pick = input.nextInt();
        int pickDigit1 = pick % 10;
        int pickDigit2 = pick / 10 % 10;
        int pickDigit3 = pick / 100;
        int lottery = 100 + (int) (Math.random() * (1000 - 100));
        System.out.println("The lottery number is " + lottery);
        int lotteryDigit1 = lottery % 10;
        int lotteryDigit2 = lottery / 10 % 10;
        int lotteryDigit3 = lottery / 100;


        if (pick == lottery) {
            System.out.println("Matched three numbers in the exact order!!! 10.000$ Prize!!!");
        } else if (pickDigit1 == lotteryDigit2 && pickDigit2 == lotteryDigit1 && pickDigit3 == lotteryDigit3 ||

                pickDigit1 == lotteryDigit1 && pickDigit2 == lotteryDigit3 && pickDigit3 == lotteryDigit2 ||

                pickDigit1 == lotteryDigit2 && pickDigit2 == lotteryDigit3 && pickDigit3 == lotteryDigit1 ||

                pickDigit1 == lotteryDigit3 && pickDigit2 == lotteryDigit1 && pickDigit3 == lotteryDigit2 ||

                pickDigit1 == lotteryDigit3 && pickDigit2 == lotteryDigit2 && pickDigit3 == lotteryDigit1) {
            System.out.println("Matched all digits in the lottery number!!! 3.000$ Prize!!!");
        } else if (pickDigit1 == lotteryDigit1 || pickDigit1 == lotteryDigit2 || pickDigit1 == lotteryDigit3 ||

                pickDigit2 == lotteryDigit1 || pickDigit2 == lotteryDigit2 || pickDigit2 == lotteryDigit3 ||

                pickDigit3 == lotteryDigit1 || pickDigit3 == lotteryDigit2 || pickDigit3 == lotteryDigit3) {
            System.out.println("Matched one digit in the lottery number!!! 1.000$ Prize!!!");
        } else {
            System.out.println("Sorry no match :( ");
        }

    }
}
