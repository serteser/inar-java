package week_09.live_class;

import java.awt.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class TestOnQuestion {
    public static void main(String[] args) {
        int[] a = new int[20];
        initializeArray(a);
        sortingArray(a);

        System.out.println(Arrays.toString(a));

        Date time = new Date();
        System.out.println(time.getTime());
        System.out.println(time);

        Random number = new Random();
        System.out.println(number.nextInt());
        System.out.println(number.nextFloat());
        System.out.println(number.nextDouble());
        System.out.println(number.nextLong());
        System.out.println(number.nextBoolean());

        System.out.println("**************************************");
        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        Random random2 = new Random(3);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
        System.out.println("**************************************");

    }

    public static void initializeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
    }

    public static void sortingArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int currentMin = a[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (currentMin > a[j]) {
                    currentMin = a[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                a[currentMinIndex] = a[i];
                a[i] = currentMin;
            }
        }
    }
}
