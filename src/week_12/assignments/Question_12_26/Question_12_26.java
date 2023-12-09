package week_12.assignments.Question_12_26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_26 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\User\\Workspace\\inar-java\\src\\week_12\\assignments\\Question_12_26\\file1.txt");

        ArrayList<StringBuilder> list = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {

                String s = input.next();
                StringBuilder stringBuilder = new StringBuilder(s);

                if (s.matches("Question\\d_\\d")) {
                    stringBuilder.insert(8, '0');
                    stringBuilder.insert(11, '0');
                    list.add(stringBuilder);

                } else if (s.matches("Question\\d_\\d{2}")) {
                    stringBuilder.insert(8, '0');
                    list.add(stringBuilder);

                } else if (s.matches("Question\\d{2}_\\d")) {
                    stringBuilder.insert(11, '0');
                    list.add(stringBuilder);

                } else {
                    list.add(stringBuilder);
                }
            }
        }
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }
}
