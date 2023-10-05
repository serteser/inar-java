package week_07.live_class;

import java.util.Scanner;

public class ProcessingNumber_9_SimplifyingCoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number (between 1 and 12): ");
        int numberOfMonth = input.nextInt();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.printf("The month that you have chosen is \"%s\" as a word.", months[numberOfMonth-1]);
    }
}
