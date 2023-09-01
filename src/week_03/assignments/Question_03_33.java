package week_03.assignments;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1 : ");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();
        double unitCost1 = price1 / weight1;
        System.out.print("Enter weight and price for package 2 : ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();
        double unitCost2 = price2 / weight2;

        if (unitCost1 > unitCost2) {
            System.out.println("Package 2 has a better price.");
        }
        if (unitCost1 < unitCost2) {
            System.out.println("Package 1 has a better price.");
        }
        if (unitCost1 == unitCost2) {
            System.out.println("Two packages have the same price.");
        }


    }
}
