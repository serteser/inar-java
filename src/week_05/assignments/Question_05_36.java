package week_05.assignments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ısbn as integer: ");
        int isbnNumber = input.nextInt();
        int checksum = 0;
        int d = 0;
        String s = isbnNumber + "";
        char ch = 'X';
        System.out.println(s.length());
        for (int i = 1, k = 1; i <= 9; i++, k *= 10) {
            d = (isbnNumber / k) % 10;
            checksum += d * (10 - i);
        }
        if (checksum % 11 == 10) {
            s += ch + "";
        } else {
            s += (checksum % 11) + "";
        }
        if (s.length() == 9) {
            System.out.printf("The ISBN-10 number is 0%s", s);
        } else {
            System.out.printf("The ISBN-10 number is %s", s);
        }

    }
}
