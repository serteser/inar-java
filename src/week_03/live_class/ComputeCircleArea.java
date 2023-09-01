package week_03.live_class;

import java.util.Scanner;

public class ComputeCircleArea {
        public static void main(String[] args) {
            final double PI = 3.14159;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number for radius:");
            double radius = input.nextDouble();
            double area = Math.pow(radius,2)*PI;
            if ( radius < 0){
                System.out.println("\"Incorrect input\"");
            } else
                System.out.println("The area of the circle of radius " + radius + " is " + area);
        }
    }


