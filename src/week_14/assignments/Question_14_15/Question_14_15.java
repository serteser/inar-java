package week_14.assignments.Question_14_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_15 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getList();
        ArrayList<Integer> list1 = missingNumbers(list);
        System.out.println("Numbers missing from the ArrayList: " + list1);
    }

    public static ArrayList<Integer> getList() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int numberOfElements = input.nextInt();
        System.out.println("Enter the elements of the ArrayList (each in the range [1, n]): ");

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {

            list.add(input.nextInt());
        }
        return list;
    }

    public static ArrayList<Integer> missingNumbers(ArrayList<Integer> list) {

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= list.size(); i++) {

            list1.add(i);
        }
        for (int i = 0; i < list.size(); i++) {

            if(list1.contains(list.get(i))){
                list1.remove(list.get(i));
            }
        }
        return list1;
    }
}
