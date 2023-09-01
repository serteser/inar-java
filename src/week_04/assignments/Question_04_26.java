package week_04.assignments;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in dollars and cents: ");
        String s = input.nextLine();
        double amount = Double.parseDouble(s);
        int totalPennies = (int) (amount * 100);
        int dollars = totalPennies / 100;
        int quarters = (totalPennies % 100) / 25;
        int dimes = ((totalPennies % 100) % 25) / 10;
        int nickels = (((totalPennies % 100) % 25) % 10) / 5;
        int pennies = (((totalPennies % 100) % 25) % 10) % 5;
        System.out.println("Equivalent in Monetary Units: " + "\nDollars: " + dollars + "\nQuarters: " + quarters + "\nDimes: "
                + dimes + "\nNickels: " + nickels + "\nPennies: " + pennies);


    }
}
