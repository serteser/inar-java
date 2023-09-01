package week_03.live_class;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your math grade: ");
        double grade = input.nextDouble();
        if (grade >= 90) {
            System.out.println("A\n");
            System.out.println("\"Congratulations !! \"");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade>=60) {
            System.out.println("D");
        } else {
            System.out.println("F");
            System.out.println("\"You need hard working, otherwise you will FAİL !!! \"\n");
        }
        System.out.println("The next exam date will be revealed by coming month. Keep in tune. ");
    }
}
