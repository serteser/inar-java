package week_03.assignments;
import java.util.Scanner;
public class Question_03_06 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter feet: ");
        int feet = input.nextInt();
        System.out.print("Enter inches: ");
        int inches = input.nextInt();
        double weightInKilograms = weightInPounds * 0.4535_9237;
        double heightInMeters = (feet * 0.3048) + (inches * 0.0254);
        double bmı = weightInKilograms/Math.pow(heightInMeters,2);
        System.out.println("BMI is " +bmı);
        if(bmı<18.5){
            System.out.print("Underweight");
        }else if(bmı<25.0){
            System.out.print("Normal");
        }else if(bmı<30.0){
            System.out.print("Overweight");
        }else if(bmı>=30.0){
            System.out.print("Obese");
        }

    }
}
