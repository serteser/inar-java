package week_05.assignments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ısbn as integer: ");

        int isbnNumber = input.nextInt();
        int checksum = 0;
        int digits = 0;

        String s = "";
        char ch = 'X';

        for (int i = 1, k = 1; i <= 9; i++, k *= 10) {
            digits = (isbnNumber / k) % 10;
            checksum += digits * (10 - i);
            s= digits + s;
        }

        if (checksum % 11 == 10) {
            s = s+ch ;
        } else {
            s =s+ (checksum % 11) ;
        }
        System.out.printf("The ISBN-10 number is %s", s);


    }
}
