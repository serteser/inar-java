package week_13.assignments.Question_13_03;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_13_03 {
    public static void main(String[] args) {

        Number[] number = {1, 1.5, 10, 1.53, 5, 12.5, 65};

        ArrayList<Number> list = new ArrayList<>(Arrays.asList(number));

        System.out.println("Before sorting..");
        System.out.println(Arrays.toString(number));
        System.out.println("After sorting..");
        sort(list);

    }

    public static void sort(ArrayList<Number> list) {
        ArrayList<Number> number = new ArrayList<>();

        int i = 0;
        while (!list.isEmpty()) {

            double min = list.get(i).doubleValue();
            int index = i;

            for (int j = i + 1; j < list.size(); j++) {

                if (min > list.get(j).doubleValue()) {
                    min = list.get(j).doubleValue();
                    index = j;
                }
            }
            if (min == list.get(i).doubleValue()) {
                if ((int) min == min) {
                    number.add((int) min);
                    list.remove(list.get(i));
                } else {
                    number.add(min);
                    list.remove(list.get(i));
                }
            } else {
                if ((int) min == min) {
                    number.add((int) min);
                    list.remove(list.get(index));
                } else {
                    number.add(min);
                    list.remove(list.get(index));
                }
            }
        }
        System.out.println(number);
    }
}
