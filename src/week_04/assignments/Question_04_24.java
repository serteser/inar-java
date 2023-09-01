package week_04.assignments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.println("Enter the second city: ");
        String secondCity = input.nextLine();
        System.out.println("Enter the third city: ");
        String thirdCity = input.nextLine();
        System.out.print("The three cities in alphabetical order are ");
        if (firstCity.compareTo(secondCity) < 0 && firstCity.compareTo(thirdCity) < 0 && secondCity.compareTo(thirdCity) < 0) {
            System.out.println(firstCity + " " + secondCity + " " + thirdCity);
        } else if (firstCity.compareTo(thirdCity) < 0 && firstCity.compareTo(secondCity) < 0 && thirdCity.compareTo(secondCity) < 0) {
            System.out.println(firstCity + " " + secondCity + " " + thirdCity);
        } else if (secondCity.compareTo(firstCity) < 0 && secondCity.compareTo(thirdCity) < 0 && firstCity.compareTo(thirdCity) < 0) {
            System.out.println(secondCity + " " + firstCity + " " + thirdCity);
        } else if (secondCity.compareTo(thirdCity) < 0 && secondCity.compareTo(firstCity) < 0 && thirdCity.compareTo(firstCity) < 0) {
            System.out.println(secondCity + " " + thirdCity + " " + firstCity);
        } else if (thirdCity.compareTo(firstCity) < 0 && thirdCity.compareTo(secondCity) < 0 && firstCity.compareTo(secondCity) < 0) {
            System.out.println(thirdCity + " " + firstCity + " " + secondCity);
        } else if (thirdCity.compareTo(secondCity) < 0 && thirdCity.compareTo(firstCity) < 0 && secondCity.compareTo(firstCity) < 0) {
            System.out.println(thirdCity + " " + secondCity + " " + thirdCity);
        } else {
            System.out.println("invalid input");
        }


    }
}


