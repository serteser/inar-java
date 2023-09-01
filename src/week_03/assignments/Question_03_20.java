package week_03.assignments;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double outsideTemperature = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();
        double windChillTemperature = (35.74 + (0.6215 * outsideTemperature) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * outsideTemperature * Math.pow(speed, 0.16)));


        if (-58 < outsideTemperature && outsideTemperature < 41 && speed >= 2) {
            System.out.println("The wind chill index is " + windChillTemperature);
        } else {
            if (!(-58 < outsideTemperature) || !(outsideTemperature < 41)) {
                System.out.println("The temperature invalid");
            }
            if (!(speed >= 2)) {
                System.out.println("The wind speed invalid");
            }

        }

    }
}

