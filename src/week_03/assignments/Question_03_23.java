package week_03.assignments;
import java.util.Scanner;
public class Question_03_23 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if(-5<=x2 && x2<=5 && -2.5<=y2 && y2<=2.5){
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the rectangle");
        }else{
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the rectangle");
        }

    }
}
