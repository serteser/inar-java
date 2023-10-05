package week_07.assignments;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] arrayOfNumber = new int[5];
        for (int i = 0; i < arrayOfNumber.length; i++) {
            arrayOfNumber[i] = input.nextInt();
        }
        System.out.printf("The greatest common divisor is %d", gcd(arrayOfNumber));

    }

    public static int gcd(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int gcd = 1;
        for (int k = min; 2 <= k; k--) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % k == 0) {
                    gcd = k;
                } else {
                    gcd = 1;
                    break;
                }
            }
            if (gcd != 1) {
                break;
            }
        }
        return gcd;
    }
}
