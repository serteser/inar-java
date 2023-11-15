package week_11.assignments.Question_11_07;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {

        ArrayList<Integer> list = getInput();
        System.out.println("Before shuffling..");
        displayList(list);
        System.out.println("\n\nAfter shuffling..");
        shuffle(list);
        displayList(list);
    }

    public static ArrayList<Integer> getInput() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0: ");
        int integers;

        do {
            integers = input.nextInt();
            if (integers != 0) {
                list.add(integers);

            }

        } while (integers != 0);
        return list;
    }

    public static void displayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
