package week_14.assignments.Question_14_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size 'n' for ArrayList A: ");
        int sizeOfA = input.nextInt();
        ArrayList<Integer> listA = getList(input, sizeOfA, 'A');

        System.out.print("Enter the size 'n' for ArrayList B: ");
        int sizeOfB = input.nextInt();
        ArrayList<Integer> listB = getList(input, sizeOfB, 'B');

        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);
        listA.addAll(listB);

        ArrayList<Integer> listC = (ArrayList<Integer>) listA.clone();

        System.out.println("\nMerged and sorted ArraylistC: ");
        System.out.println(listC);

    }

    public static ArrayList<Integer> getList(Scanner scan, int i, char a) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.printf("Enter %d Integers for ArrayList %s: ", i, a);
        for (int j = 0; j < i; j++) {

            list.add(scan.nextInt());
        }
        return list;
    }
}
