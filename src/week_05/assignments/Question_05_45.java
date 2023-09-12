package week_05.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");

        double mean = 0;
        double sum = 0;
        double sum2 = 0;
        int count = 0;


        for (int i = 1; i <= 10; i++) {

            double data = input.nextDouble();

            sum += data;
            count++;
            mean = sum / count;
            sum2 += Math.pow(data, 2);


        }
        double deviation = Math.sqrt(((sum2 - ((Math.pow(sum, 2)) / count)) / (count - 1)));
        System.out.printf("The mean is %4.2f", mean);
        System.out.printf("\nThe standard deviation is %7.5f", deviation);


    }

}
