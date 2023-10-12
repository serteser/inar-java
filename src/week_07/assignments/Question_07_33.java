package week_07.assignments;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        String[] zodiacSigns = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        System.out.printf("%d is a year of %s in zodiac", year, zodiacSigns[year % 12]);
    }
}
