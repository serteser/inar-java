package week_14.assignments.Question_14_06;

import java.util.ArrayList;

public class Question_14_06 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getTenNumbers();
        System.out.print("Original List: " + list);

        ArrayList<Integer> rearrangedList = rearrangedList(list);
        System.out.print("\nRearrangedList List: " + rearrangedList);
    }

    public static ArrayList<Integer> getTenNumbers() {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            list.add((int) (10 + Math.random() * 90));
        }
        return list;
    }

    public static ArrayList<Integer> rearrangedList(ArrayList<Integer> list) {

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        int i = 0;
        while (!list.isEmpty()) {

            if (list.get(i) % 2 == 0) {

                evenList.add(list.get(i));
                list.remove(list.get(i));
                i--;
            } else {
                oddList.add(list.get(i));
                list.remove(list.get(i));
                i--;
            }
            i++;
        }
        oddList.addAll(evenList);
        return oddList;
    }
}
