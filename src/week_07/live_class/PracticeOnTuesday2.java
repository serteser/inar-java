package week_07.live_class;

import java.util.Arrays;

public class PracticeOnTuesday2 {
    public static void main(String[] args) {
        int[] testArrayOne = {2, 10, 3, 4, 20, 5}; //[2, 10, 10, 10, 20, 20]
        int[] testArrayTwo = {10, 1, 20, 2}; // [10, 10, 20, 20]
        int[] testArrayThree = {10, 1, 9, 20}; // [10, 10, 10, 20]
        System.out.println(Arrays.toString(tenRun(testArrayOne)));
        System.out.println(Arrays.toString(tenRun(testArrayTwo)));
        System.out.println(Arrays.toString(tenRun(testArrayThree)));
    }

    public static int[] tenRun(int[] array) {
        int numberDeviseByTen;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0) {
                numberDeviseByTen = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if(array[j] % 10 != 0){
                        array[j] = numberDeviseByTen;
                    }else{
                        break;
                    }
                }
            }
        }
        return array;
    }
}
