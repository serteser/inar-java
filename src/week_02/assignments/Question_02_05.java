package week_02.assignments;

import java.util.*;

public class Question_02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate:");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();
        double gratuity = gratuity_rate / 10;
        double total = subtotal + ((subtotal * 15) / 100);
        System.out.println("The gratuity is  $" + gratuity + " and total is  $" + total);

    }
}