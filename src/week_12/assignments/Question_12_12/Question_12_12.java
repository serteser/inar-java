package week_12.assignments.Question_12_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_12 {
    public static void main(String[] args) {
        /**
         *The whole string represents on the terminal may look like this
         *PS C:\Users\User\workspace\inar-java\out\production\inar-java> java week_12.assignments.Question_12_12.Question_12_12 next_line_brace_style.txt
         */

        File sourceFile = new File(args[0]);

        if (!sourceFile.exists()) {
            System.out.println(sourceFile.getName() + " does not created yet.");

            try {
                try (
                        PrintWriter output = new PrintWriter(sourceFile);
                ) {
                    output.println("public class Test");
                    output.println("{");
                    output.println("\tpublic static void main (String[] args)");
                    output.println("\t{");
                    output.println("\n\t}");
                    output.println("}");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        File targetFile = new File("end-of-line_brace_style.txt");
        if (!targetFile.exists()) {
            System.out.println(sourceFile.getName() + " does not created yet.");

            try {
                try (
                        PrintWriter output = new PrintWriter(targetFile);
                ) {
                    output.print("");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        ArrayList<String> lines = new ArrayList<>();

        if (sourceFile.exists()) {

            try {
                Scanner scanner = new Scanner(sourceFile);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    lines.add(line);

                }

                for (int i = 1; i < lines.size(); i++) {
                    if (lines.get(i).contains("{")) {
                        String source = lines.get(i);
                        source = source.replace('{', ' ');
                        String target = lines.get(i - 1);
                        target = target + " {";
                        lines.set(i, source);
                        lines.set(i - 1, target);
                    }
                }
                PrintWriter writer = new PrintWriter(targetFile);

                for (String line : lines) {
                    writer.println(line);
                }
                writer.close();

            } catch (FileNotFoundException e) {
                System.out.println("File could not be found to exist: " + e);

            }
        }
    }
}
