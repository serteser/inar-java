package week_11.assignments.Question_11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getList();
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        displayList(list);
    }

    public static ArrayList<Integer> getList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }

    public static void displayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
