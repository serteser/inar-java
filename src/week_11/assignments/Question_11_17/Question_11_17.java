package week_11.assignments.Question_11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {

        int integer = getInt();
        ArrayList<Integer> list = findFactorsOfInteger(integer);
        int n = findFactorOfPerfectSquare(list);
        System.out.printf("The smallest number n for m * n to be a perfect square is %d   m * n is %d ", n, (n * integer));
    }

    public static int getInt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        return input.nextInt();
    }

    public static ArrayList<Integer> findFactorsOfInteger(int integer) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 2;
        do {
            if (integer % i == 0) {

                do {
                    list.add(i);
                    integer = integer / i;

                } while (integer % i == 0);
            }
            i++;
        } while (integer != 1);

        return list;
    }

    public static int findFactorOfPerfectSquare(ArrayList<Integer> list) {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!odd.contains(list.get(i))) {
                odd.add(list.get(i));
            } else {
                odd.remove(list.get(i));
            }
        }

        int n = 1;
        for (int i = 0; i < odd.size(); i++) {
            n *= odd.get(i);
        }
        return n;
    }
}
