package week_03.assignments;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height : ");
        double r1x = input.nextDouble(); // x coordinate for the first rectangle
        double r1y = input.nextDouble(); // y coordinate for the first rectangle
        double r1Width = input.nextDouble(); // width for the first rectangle
        double r1Height = input.nextDouble(); // height for the first rectangle
        System.out.print("Enter r2's center x-, y-coordinates, width, and height : ");
        double r2x = input.nextDouble(); // x coordinate for second rectangle
        double r2y = input.nextDouble(); // y coordinate for second rectangle
        double r2Width = input.nextDouble(); // width for second rectangle
        double r2Height = input.nextDouble(); // height for second rectangle

        double r1x0 = 0 - r1x; // required value to take the center of the rectangle in the origin point for x
        double r1y0 = 0 - r1y; // required value to take the center of the rectangle in the origin point for y

        double r2x0 = r2x + r1x0;
        double r2y0 = r2y + r1y0;


        if ((r1Width / 2 > r2x0 + r2Width / 2) && r1Height / 2 > r2y0 + r2Height / 2) {
            System.out.println("r2 is inside r1");
        }
        if ((r1Width / 2) <= (r2x0 + r2Width / 2) ^ (r1Height / 2) <= (r2y0 - r2Height / 2)) {
            System.out.println("r2 overlaps r1");
        }
        if ((r1Width / 2) < (r2x0 - r2Width / 2) && (r1Height / 2) < (r2y0 - r2Height / 2)) {
            System.out.println("r2 does not overlap r1");
        }


    }
}
