package week_11.assignments.Question_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {

        ArrayList<Double> doubles = getInput();
        System.out.println("Sum of list " + sum(doubles));
    }

    public static ArrayList<Double> getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Double> doubles = new ArrayList<>();
        double value;
        do {
            value = input.nextDouble();
            if (value != 0) {
                doubles.add(value);
            }
        } while (value != 0);
        return doubles;
    }

    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }
}
