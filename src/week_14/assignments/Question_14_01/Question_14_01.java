package week_14.assignments.Question_14_01;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_01 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            integers.add((int) (Math.random() * 100));
        }

        System.out.println("Generated integers: " + integers);

        Collections.reverse(integers);
        System.out.println("Reversed list: " + integers);
    }
}
