package week_14.assignments.Question_14_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {

        ArrayList<Integer> integerList = getList();

        Integer[] integerArray = toArray(integerList);

        ArrayList<Integer> integerListEditing = allZerosBackward(integerArray);

        System.out.print("ArrayList after moving zeros to the end: \n" + integerListEditing);


    }

    public static ArrayList<Integer> getList() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers for ArrayList nums (enter -1 to stop): ");

        ArrayList<Integer> numbers = new ArrayList<>();
        int data = input.nextInt();

        while (data != -1) {

            numbers.add(data);
            data = input.nextInt();

        }
        return numbers;
    }

    public static Integer[] toArray(ArrayList<Integer> list) {

        Integer[] array = new Integer[list.size()];

        return list.toArray(array);
    }

    public static ArrayList<Integer> allZerosBackward(Integer[] num) {

        Integer[] temp = new Integer[num.length];

        int indexEnd = num.length - 1;
        int indexStart = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] == 0) {
                temp[indexEnd] = num[i];
                indexEnd--;
            } else {
                temp[indexStart] = num[i];
                indexStart++;
            }
        }
        return new ArrayList<>(Arrays.asList(temp));
    }
}
