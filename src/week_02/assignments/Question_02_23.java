package week_02.assignments;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
        System.out.print("The cost of driving is  $" + (int) (costOfDriving*100)/100.0);


    }
}
