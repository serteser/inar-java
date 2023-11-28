package week_13.assignments.Question_13_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question_13_02 {
    public static void main(String[] args) {

        Number[] number = {1, 1.5, 10, 1.53, 5, 12.5, 65};

        ArrayList<Number> list = new ArrayList<>(Arrays.asList(number));

        System.out.println("Before shuffle..");
        System.out.println(Arrays.toString(number));
        System.out.println("After shuffle..");
        shuffle(list);
    }

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }
}
