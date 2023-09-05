package week_05.live_class;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        int data;
        int sum= 0;

        Scanner input=new Scanner (System.in);
        System.out.println();

        // Keep reading data until the input is 0
        do{
            //read the next data
            System.out.println("Enter an integer (the input ends if it is 0):");
            data=input.nextInt();

            sum+=data;
        }while(data!=0);

        System.out.println("The sum is " +sum);

    }
}
