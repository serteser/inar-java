package week_14.assignments.Question_14_17;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {

        Map<Integer, Integer> numbers = findOccurrencesWhileReadInput();

        displayResult(numbers);
    }

    public static Map<Integer, Integer> findOccurrencesWhileReadInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to stop): ");

        Map<Integer, Integer> map = new HashMap<>();

        int data = input.nextInt();
        while (data != 0) {

            if (!map.containsKey(data)) {
                map.put(data, 1);
            } else {
                int value = map.get(data);
                value++;
                map.put(data, value);
            }
            data = input.nextInt();
        }
        return map;
    }

    public static void displayResult(Map<Integer, Integer> numbers) {

        Set<Map.Entry<Integer, Integer>> entrySet = numbers.entrySet();
        int count = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : entrySet) {

            if (count == 0) {

                value = entry.getValue();
                count++;
                continue;
            }
            if (value < entry.getValue()) {
                value = entry.getValue();
            }
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : entrySet) {

            if (entry.getValue() == value) {
                result.add(entry.getKey());
            }
        }
        System.out.println("Number(s) with the most occurrences: ");
        for (Map.Entry<Integer, Integer> entry : entrySet) {

            if (entry.getValue() == value) {
                System.out.printf("%d --> %d times.\n", entry.getKey(), value);
            }
        }
    }
}
