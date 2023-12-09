package week_14.assignments.Question_14_07;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_07 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getTenNumbers();
        System.out.print("Generated List: " + list);

        Collections.sort(list);
        System.out.println();
        System.out.println(list);

        int key = (int) (Math.random() * 10);

        System.out.printf("\nWhat's the %d. greatest number\n", key + 1);
        System.out.printf("The %dth largest element is: %d", (key + 1), displayNumber(key, list));


    }

    public static ArrayList<Integer> getTenNumbers() {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            list.add((int) (10 + Math.random() * 90));
        }
        return list;
    }

    public static Integer displayNumber(int key, ArrayList<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(key);
    }
}
