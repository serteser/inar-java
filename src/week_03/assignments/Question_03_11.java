package week_03.assignments;

import java.util.Scanner;

public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month as integer: ");
        int numberOfMonth = input.nextInt();
        System.out.print("Enter the year as integer:  ");
        int numberOfYear = input.nextInt();

        if (numberOfMonth == 1) {
            System.out.println("January " + numberOfYear + " had 31 days");
        } else if (numberOfMonth == 2) {
            if (numberOfYear % 4 == 0) {
                System.out.println("February " + numberOfYear + " had 29 days");
            } else {
                System.out.println("February " + numberOfYear + " had 28 days");
            }
        } else if (numberOfMonth == 3) {
            System.out.println("March " + numberOfYear + " had 31 days");
        } else if (numberOfMonth == 4) {
            System.out.println("April " + numberOfYear + " had 30 days");
        } else if (numberOfMonth == 5) {
            System.out.println("May " + numberOfYear + " had 31 days");
        } else if (numberOfMonth == 6) {
            System.out.println("June " + numberOfYear + " had 30 days");
        } else if (numberOfMonth == 7) {
            System.out.println("July " + numberOfYear + " had 31 days");
        } else if (numberOfMonth == 8) {
            System.out.println("August " + numberOfYear + " had 31 days");
        } else if (numberOfMonth == 9) {
            System.out.println("September " + numberOfYear + " had 30 days");
        } else if (numberOfMonth == 10) {
            System.out.println("October " + numberOfYear + " had 31 days");
        } else if (numberOfMonth == 11) {
            System.out.println("November " + numberOfYear + " had 30 days");
        } else if (numberOfMonth == 12) {
            System.out.println("December " + numberOfYear + " had 31 days");
        }


    }
}
