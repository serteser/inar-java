package week_04.assignments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String majorAndStatus = input.nextLine();
        char major = majorAndStatus.charAt(0);
        char status = majorAndStatus.charAt(1);
        if (majorAndStatus.length() != 2) {
            System.out.println("Please enter exactly two characters.");
            System.exit(1);
        }
        if (major == 77) {
            System.out.print("Mathematics ");
            if (status == 49) {
                System.out.println("Freshman");
            } else if (status == 50) {
                System.out.println("Sophomore");
            } else if (status == 51) {
                System.out.println("Junior");
            } else if (status == 52) {
                System.out.println("Senior");
            }
        } else if (major == 67) {
            System.out.print("Computer Science ");
            if (status == 49) {
                System.out.println("Freshman");
            } else if (status == 50) {
                System.out.println("Sophomore");
            } else if (status == 51) {
                System.out.println("Junior");
            } else if (status == 52) {
                System.out.println("Senior");
            }
        } else if (major == 73) {
            System.out.print("Information Technology ");
            if (status == 49) {
                System.out.println("Freshman");
            } else if (status == 50) {
                System.out.println("Sophomore");
            } else if (status == 51) {
                System.out.println("Junior");
            } else if (status == 52) {
                System.out.println("Senior");
            }
        }else{
            System.out.println("Invalid input");
        }


    }
}
