package week_14.assignments.Question_14_21;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first list: ");
        ArrayList<Integer> firstList = getList(input);

        System.out.print("Enter the second list: ");
        ArrayList<Integer> secondList = getList(input);

        System.out.println("Intersection of the two lists: " + repeatedIntegers(firstList, secondList));
    }

    public static ArrayList<Integer> getList(Scanner input) {

        String s = input.nextLine();
        String[] str = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {

            list.add(Integer.parseInt(str[i]));
        }
        return list;
    }

    public static ArrayList<Integer> repeatedIntegers(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> list = new ArrayList<>();
        int length = Math.max(list1.size(), list2.size());

        for (int i = 0; i < length; i++) {

            if (list2.contains(list1.get(i))) {
                list.add(list1.get(i));
            }
        }
        return list;
    }
}
