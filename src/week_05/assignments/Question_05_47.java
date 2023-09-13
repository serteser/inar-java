package week_05.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn12 = input.nextLine();

        if(isbn12.length()!=12){
            System.out.printf("%s is an invalid input",isbn12 );
        }else{
            long isbn = Long.parseLong(isbn12);
            long sum=0;

            for (long i = 1, j=1; i<=12; i++, j*=10){

                if(i%2!=0){
                    sum += 3*((isbn/j)%10);
                }else{
                    sum+= ((isbn/j)%10);
                }

            }
            long checksum= (10-(sum%10));

            String isbn13= "";

            if((10-(sum%10))==10){
                isbn13+=isbn12 + "0";
            }else{
                isbn13+=isbn12 + checksum + " ";
            }
            System.out.printf("The ISBN-13 number is %s",isbn13);
        }




    }
}
