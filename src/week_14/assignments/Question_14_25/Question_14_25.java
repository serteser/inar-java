package week_14.assignments.Question_14_25;

import java.util.ArrayList;

public class Question_14_25 {
    public static void main(String[] args) {

        ArrayList<Integer> list = generatedList();
        System.out.println("Generated ArrayList: \n" + list);

        Integer targetSum = (int) (Math.random() * 100);
        System.out.println("Generated Target Sum: " + targetSum);

        int[] result = result(list, targetSum);
        System.out.print(result[0] + result[1] != 0 ? ("Numbers are: " + result[0] + ", " + result[1] + "\nResult: true") : "No numbers that their sum is equal to the target sum.");

    }

    public static ArrayList<Integer> generatedList() {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {

            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    public static int[] result(ArrayList<Integer> list, Integer targetSum) {

        int[] numbers = new int[2];
        for (int i = 0; i < list.size(); i++) {

            int number = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {

                if ((number + list.get(j)) == targetSum) {

                    numbers[0] = number;
                    numbers[1] = list.get(j);
                }
            }
        }
        return numbers;
    }
}
