package week_12.assignments.Question_12_21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_21\\SortedStrings.txt");

        if (!file.exists()) {
            System.out.println("The file is not exist!");
            System.exit(1);
        }

        ArrayList<String> listOriginal = new ArrayList<>();
        ArrayList<String> listSorted = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {
            String s;
            while (input.hasNext()) {
                s = input.next();
                listOriginal.add(s);
                listSorted.add(s);

            }
            Collections.sort(listSorted);
            for (int i = 0; i < listSorted.size(); i++) {
                if (!listSorted.get(i).equalsIgnoreCase(listOriginal.get(i))) {
                    result.add(i);
                }
            }


        } catch (IOException | ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);

        }
        if (result.isEmpty()) {
            System.out.println("The text has not include any word that out of order.");
        } else {
            System.out.printf("File\nC:\\Users\\User\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_21\\SortedStrings.txt" +
                    "\nThe strings %d and %d are out of order", result.get(0), result.get(1));
        }


    }
}
