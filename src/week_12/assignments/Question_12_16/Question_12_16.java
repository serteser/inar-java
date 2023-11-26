package week_12.assignments.Question_12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_16 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: : java Question_12_16 fileName oldStr newStr");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        ArrayList<String> list = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {

            String str;
            while (input.hasNext()) {
                str = input.nextLine().replace(args[1], args[2]);
                list.add(str);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try (PrintWriter output = new PrintWriter(file)) {

            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
