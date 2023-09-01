package week_03.assignments;
import java.util.Scanner;
public class Question_03_19 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three edges of the triangle: ");
        int edge1 = input.nextInt();
        int edge2 = input.nextInt();
        int edge3 = input.nextInt();

        double perimeter = edge1 + edge2 + edge3;

        if((edge1+edge2)>edge3){
            System.out.println("The perimeter is " + perimeter);
        }else{
            System.out.println("The input is invalid.");
        }




    }
}
