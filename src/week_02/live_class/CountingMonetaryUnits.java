package week_02.live_class;

import java.util.Scanner;

public class CountingMonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your total money: ");
        double totalMoney = input.nextDouble();
        int totalPennies = (int) (totalMoney * 100);
        int dollars = totalPennies / 100;
        int remainingPennies = totalPennies % 100;
        int quarters = remainingPennies / 25;
        remainingPennies = remainingPennies % 25;
        int dimes = remainingPennies / 10;
        remainingPennies = remainingPennies % 10;
        int nickels = remainingPennies / 5;
        remainingPennies = remainingPennies % 5;
        int pennies = remainingPennies;

        System.out.println(dollars + " dollars; ");
        System.out.println(quarters + " quarters; ");
        System.out.println(dimes + " dimes; ");
        System.out.println(nickels + " nickels; ");
        System.out.println(pennies + " pennies; ");

    }
}