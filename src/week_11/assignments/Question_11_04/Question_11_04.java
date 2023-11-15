package week_11.assignments.Question_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getInput();
        System.out.printf("The largest number in the list is %d",max(list));

    }

    public static ArrayList<Integer> getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers ending with 0: ");
        ArrayList<Integer> list = new ArrayList<>();
        int value;
        do {

            value = input.nextInt();
            if (value != 0) {
                list.add(value);
            }

        } while (value != 0);
        return list;
    }

    public static Integer max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}
