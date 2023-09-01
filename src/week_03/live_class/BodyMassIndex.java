package week_03.live_class;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();
        System.out.print("Enter the height in inches: ");
        double heightInches = input.nextDouble();

        double weightKilograms = weightPounds * 0.453_592_37;
        double heightMeters = heightInches * 0.0254;

        double bodyMassIndex = weightKilograms/Math.pow(heightMeters,2);
        System.out.println("BMI is " + bodyMassIndex );

        if(bodyMassIndex<18.5){
            System.out.println("Underweight");
        }else if (bodyMassIndex<25.0) {
            System.out.println("Normal");
        }else if (bodyMassIndex<30.0) {
            System.out.println("Overweight");
        }else if (bodyMassIndex>=30.0) {
            System.out.println("Obese");
        }

    }
}
