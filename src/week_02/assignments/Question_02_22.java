package week_02.assignments;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
        int totalAmount = input.nextInt();
        int dollars = totalAmount / 100;
        int remainingPennies = totalAmount % 100;
        int quarters = remainingPennies / 25;
        remainingPennies = remainingPennies % 25;
        int dimes = remainingPennies / 10;
        remainingPennies = remainingPennies % 10;
        int nickels = remainingPennies / 5;
        remainingPennies = remainingPennies % 5;
        int pennies = remainingPennies;
        System.out.println("Your amount " + totalAmount + " consists of");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");


    }
}
