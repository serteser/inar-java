package week_14.assignments.Question_14_13;

import java.util.ArrayList;

public class Question_14_13 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getList();
        System.out.print("Generated integers: " + list);
        ArrayList<Integer> repeatedIntegers = repeatedIntegers(list);
        System.out.print("\nElements appearing more than n/3 times: " + repeatedIntegers);

    }

    public static ArrayList<Integer> getList() {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            list.add((int) (Math.random() * 3));
        }
        return list;
    }

    public static ArrayList<Integer> repeatedIntegers(ArrayList<Integer> list) {

        int[] repeatedOfIntegers = new int[3];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            repeatedOfIntegers[list.get(i)]++;
        }

        for (int i = 0; i < repeatedOfIntegers.length; i++) {

            if (repeatedOfIntegers[i] >= list.size() / 3) {

                result.add(i);
            }
        }
        return result;
    }
}
