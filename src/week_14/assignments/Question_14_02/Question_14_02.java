package week_14.assignments.Question_14_02;

import java.util.ArrayList;

public class Question_14_02 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = generate50numbers();
        System.out.println("Generated Arraylist: \n" + numbers);


        System.out.println("\nArrayList after removing duplicates: \n" + removeDuplicateNumbers(numbers));

    }

    public static ArrayList<Integer> generate50numbers() {

        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 0; i < 50; i++) {

            number.add((int) (Math.random() * 100));
        }
        return number;
    }

    // If we prefer a solution that doesn't need creating a new List, this method can be used
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> n) {

        boolean[] booleans = new boolean[100];

        for (int i = 0; i < n.size(); i++) {

            if (booleans[n.get(i)]) {

                n.remove(n.get(i));
                i--; // when we ignore that decrement statement the result will wrong for duplicate numbers which occurs more than twice...
            } else {

                booleans[n.get(i)] = true;
            }
        }
        return n;
    }

    // If we don't care whether we get the solution with a new List, then this method can be used

//    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> n) {
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < n.size(); i++) {
//
//            if (!result.contains(n.get(i))) {
//
//                result.add(n.get(i));
//            }
//        }
//        return result;
//    }
}
