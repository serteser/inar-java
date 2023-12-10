package week_14.assignments.Question_14_23;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question_14_23 {
    public static void main(String[] args) {

        System.out.println("Enter the path of the text file: "); //"C:\\Users\\User\\Workspace\\inar-java\\src\\week_14\\assignments\\Question_14_23\\Question_23_test_data.txt");
        String filePath = new Scanner(System.in).nextLine();
        File file = new File(filePath);

        if (!file.exists()) {

            System.out.println("Please check the file path");
            System.exit(1);
        }
        try (Scanner input = new Scanner(file)) {

            Set<String> words = new TreeSet<>();
            while (input.hasNext()) {

                String s = input.nextLine();
                String[] str = s.split("[ .,;+%&/]");
                words.addAll(Arrays.asList(str));
            }
            System.out.println("Non-duplicate words in ascending order: ");
            for (String entry : words) {
                System.out.println(entry);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
