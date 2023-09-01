package week_02.live_class;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number ;
        number = input.nextInt();

        System.out.println( (4*--number)/4.0 );
        number +=5;
        System.out.println((++number)+7);
        System.out.println(++number);



    }

}
