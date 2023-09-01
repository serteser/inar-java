package week_03.assignments;

import java.util.Scanner;
public class Question_03_08 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.println("Enter 3 integers : ");
         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();


        if (b - a > 0) {
            if (b - c > 0) {
                if (a - c > 0) {
                    System.out.println(c + " < " + a + " < " + b);
                }
            }
        }
        if (b - a < 0) {
            if (b - c < 0) {
                if (a - c < 0) {
                    System.out.println(b + " < " + a + " < " + c);
                }
            }
        }
        if (b - a > 0) {
            if (b - c < 0) {
                if (a - c < 0) {
                    System.out.println(a + " < " + b + " < " + c);
                }
            }
        }
        if (b - a < 0) {
            if (b - c < 0) {
                if (a - c > 0) {
                    System.out.println(b + " < " + c + " < " + a);
                }
            }
        }
        if (b - a > 0) {
            if (b - c > 0) {
                if (a - c < 0) {
                    System.out.println(a + " < " + c + " < " + b);
                }
            }
        }
        if (b - a < 0) {
            if (b - c > 0) {
                if (a - c > 0) {
                    System.out.println(c + " < " + b + " < " + a);
                }
            }
        }
        if (a==b){
            System.out.println("İnvalid input, the numbers must be different from each other.");
        }
        if (a==c){
            System.out.println("İnvalid input, the numbers must be different from each other.");
        }
        if (b==c){
            System.out.println("İnvalid input, the numbers must be different from each other.");
        }



    }
}
