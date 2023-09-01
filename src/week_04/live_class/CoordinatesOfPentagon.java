package week_04.live_class;
import java.util.Scanner;
public class CoordinatesOfPentagon {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the bounding circle
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = scanner.nextDouble();

        // Calculate the coordinates of the five corner points
        double angle = 2 * Math.PI / 5; // Angle between two consecutive points

        // Calculate and display the coordinates of Point 1
        double x1 = radius * Math.cos(angle * 0);
        double y1 = radius * Math.sin(angle * 0);
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");

        // Calculate and display the coordinates of Point 2
        double x2 = radius * Math.cos(angle * 1);
        double y2 = radius * Math.sin(angle * 1);
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")");

        // Calculate and display the coordinates of Point 3
        double x3 = radius * Math.cos(angle * 2);
        double y3 = radius * Math.sin(angle * 2);
        System.out.println("Point 3: (" + x3 + ", " + y3 + ")");

        // Calculate and display the coordinates of Point 4
        double x4 = radius * Math.cos(angle * 3);
        double y4 = radius * Math.sin(angle * 3);
        System.out.println("Point 4: (" + x4 + ", " + y4 + ")");

        // Calculate and display the coordinates of Point 5
        double x5 = radius * Math.cos(angle * 4);
        double y5 = radius * Math.sin(angle * 4);
        System.out.println("Point 5: (" + x5 + ", " + y5 + ")");


    }
}