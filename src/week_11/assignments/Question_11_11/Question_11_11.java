package week_11.assignments.Question_11_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = getInput();
        System.out.println("Before sorting..");
        display(integers);
        sort(integers);
        System.out.println("\n\nAfter sorting..");
        display(integers);
    }

    public static ArrayList<Integer> getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0: ");
        ArrayList<Integer> integers = new ArrayList<>();
        int value;
        do {
            value = input.nextInt();
            if (value != 0) {
                integers.add(value);
            }

        } while (value != 0);
        return integers;
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void display(ArrayList<Integer> i) {
        for (int j = 0; j < i.size(); j++) {
            System.out.print(i.get(j) + " ");
        }
    }
}
