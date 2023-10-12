package week_07.live_class;

import java.util.Arrays;
import java.util.Scanner;

public class LiveClass4_07_15 {
    public static void main(String[] args) {
        // Question_07_15
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        int[] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(distinctNumber(array)));

    }

    public static int[] distinctNumber(int[] array) {
        // 0,2,3,2,1,6,3,4,5,2


        int[] result = new int[array.length];

        // 0 0 0 0 0 0 0 0 0 0

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (array[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                result[count] = array[i];
                count++;
            }
        }
        //result = {1,2,3,6,4,5,0,0,0,0}
        int[] lastResult = new int[count];
        for (int i = 0; i < count; i++) {
            lastResult[i] = result[i];
        }
        //lastResult = {1,2,3,6,4,5}
        return lastResult;
    }
}
