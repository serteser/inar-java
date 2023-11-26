package week_12.assignments.Question_12_26;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Question_12_26 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\Workspace\\inar-java\\src\\week_12\\assignments\\Question_12_26");
        //File file = new File(args[0]);

//        if (args[0].charAt(0) != '*' && args[0].length() != 1) {
//            System.out.println("Appropriate usage: java Question_12_26 *");
//            System.exit(1);
//
//        }
        if (!file.isDirectory()) {
            System.out.println("The path does not refer to any directory");
            System.exit(2);
        }

        File[] fileHolder = file.listFiles();
        for (int i = 0; i < Objects.requireNonNull(fileHolder).length; i++) {
            replaceWords(fileHolder, i);
        }

    }

    public static void replaceWords(File[] fileHolder, int i) {

        File file = new File(String.valueOf(fileHolder[i]));
        ArrayList<String> list = new ArrayList<>();

        try (Scanner input = new Scanner(file);
             PrintWriter output = new PrintWriter(file);
        ) {

            while (input.hasNext()) {

                String s = input.nextLine();
                String c = s.substring(8);
                int n = c.indexOf('_');
                String first = c.substring(0, n);
                String second = c.substring(n + 1);
                if (first.length() != 2) {
                    String temp = "0" + first;
                    first = temp;
                }
                if (second.length() != 2) {
                    String temp = "0" + second;
                    second = temp;
                }
                String newStr = "Question" + first + "_" + second;

                list.add(newStr);


            }
            for (int j = 0; j < list.size(); j++) {
                output.println(list.get(i));
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
