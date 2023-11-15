package week_11.assignments.Question_11_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {

        ArrayList<String> strings = getInput();
        System.out.println("Stack: " + strings);
        System.out.println("Displaying them in reverse order.. ");
        reverseOrder(strings);
    }

    public static ArrayList<String> getInput() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.print("Enter five strings: ");

        for (int i = 0; i < 5; i++) {
            String s = input.next();
            strings.add(s);
        }
        return strings;
    }

    public static void reverseOrder(ArrayList<String> s) {
        for (int i = s.size() - 1; i >= 0; i--) {
            System.out.print(s.get(i) + " ");
        }
    }
}
