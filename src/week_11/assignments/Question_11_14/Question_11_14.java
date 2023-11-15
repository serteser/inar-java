package week_11.assignments.Question_11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = getList(1);
        ArrayList<Integer> list2 = getList(2);
        ArrayList<Integer> list3 = union(list1, list2);
        displayList(list3);
    }

    public static ArrayList<Integer> getList(int k) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter five integers for list%d: ", k);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public static void displayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
