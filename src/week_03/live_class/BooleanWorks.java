package week_03.live_class;

import java.util.Scanner;

public class BooleanWorks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean positive = number>0;
        if (positive) {
            System.out.println("Number is larger than zero.");
        } else {
            System.out.println("Number is smaller than zero.");
        }
    }
}

