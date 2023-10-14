package week_08.live_class;

import java.util.Arrays;

public class SelfStudyOnArrays {
    public static void main(String[] args) {
        String[] string = {"D", "a", "l", "l", "a", "s"};
        System.out.println(string);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);
        for (int i = (numbers.length - 1); i > 0; i--) {
            int indexForNumber = (int) (Math.random() * (i + 1));
            int temp = numbers[indexForNumber];
            numbers[indexForNumber] = numbers[i];
            numbers[i] = temp;
        }

        //for (int i = 0; i < numbers.length / 2; i++) {
        //    int temp = numbers[i];
        //    numbers[i] = numbers[(numbers.length / 2) + 1 + i];
        //    numbers[(numbers.length / 2) + 1 + i] = temp;
        //}

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 8, 6, 4, 2, 1, 6};
        int[] count = new int[10];
        for (int i = 0; i < list.length; i++) {
            count[list[i] - 1]++;
        }
        System.out.println("counts of numbers is like that;");
        for (int i = 0; i < count.length; i++) {

            System.out.printf("%d ==> %d\n", i + 1, count[i]);
        }

        for (int i = 0; i < list.length; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        System.out.println(Arrays.toString(list));


    }






}
