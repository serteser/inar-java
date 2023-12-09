package week_14.live_class;

import java.util.HashSet;
import java.util.Set;

public class TuesdayTest {
    public static void main(String[] args) {

        Integer[] number1 = {1, 1, 3, 5, 9, 3, 3, 7, 7};
        Integer[] number2 = {4, 6, 1, 2, 6, 9, 8, 5, 4};

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < number1.length; i++) {
            result.add(number1[i]);

        }
        for (int i = 0; i < number2.length; i++) {
            result.add(number2[i]);

        }
        System.out.println(result);
    }
}
