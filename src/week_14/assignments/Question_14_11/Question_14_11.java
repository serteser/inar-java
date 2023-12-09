package week_14.assignments.Question_14_11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_11 {
    public static void main(String[] args) {

        System.out.println("Enter the java source code file name: ");
        String fileName = new Scanner(System.in).nextLine();
        File file = new File(fileName); //"C:\\Users\\User\\Workspace\\inar-java\\src\\week_14\\assignments\\Question_14_11\\file1.txt");
        ArrayList<String> sourceCode = new ArrayList<>();

        if (!file.exists()) {
            System.out.println("Check the file path please...");
            System.exit(1);
        }

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {

                sourceCode.add(input.nextLine());
            }

            if (!isValidCode(sourceCode)) {

                System.out.println("The source code has NOT correct pairs of grouping symbols.");
            } else {

                System.out.println("The source code has correct pairs of grouping symbols.");
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static boolean isValidCode(ArrayList<String> s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).matches("(.*)\\{(.*)\\)(.*)") || s.get(i).matches("(.*)\\{(.*)](.*)") || s.get(i).matches("(.*)\\{(.*)\\{(.*)")
                    || s.get(i).matches("(.*)\\{(.*)\\((.*)") || s.get(i).matches("(.*)\\{(.*)\\[(.*)")) {
                return false;
            } else if (s.get(i).matches("(.*)\\[(.*)\\)(.*)") || s.get(i).matches("(.*)\\[(.*)}(.*)") || s.get(i).matches("(.*)\\[(.*)\\{(.*)")
                    || s.get(i).matches("(.*)\\[(.*)\\((.*)") || s.get(i).matches("(.*)\\[(.*)\\[(.*)")) {
                return false;
            } else if (s.get(i).matches("(.*)\\((.*)](.*)") || s.get(i).matches("(.*)\\((.*)}(.*)") || s.get(i).matches("(.*)\\((.*)\\{(.*)")
                    || s.get(i).matches("(.*)\\((.*)\\((.*)") || s.get(i).matches("(.*)\\((.*)\\[(.*)")) {
                return false;
            }
        }
        return true;
    }
}
