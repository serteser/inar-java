package week_12.assignments.Question_12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_13 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage : java Question_12_13 filename");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        ArrayList<String> lines = new ArrayList<>();
        try {
            try (
                    Scanner input = new Scanner(file);
            ) {
                while (input.hasNext()) {
                    String line = input.nextLine();
                    lines.add(line);

                }
                int countLines = countOfLines(lines);
                int characters = countOfCharacters(lines);
                int words = countOfWords(lines);
                System.out.printf("File %s has\n%d characters\n%d words\n%d lines\n\n", args[0], characters, words, countLines);
            }
        } catch (ArrayIndexOutOfBoundsException | FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int countOfCharacters(ArrayList<String> s) throws ArrayIndexOutOfBoundsException {
        int count = 0;
        for (int i = 0; i < s.size(); i++) {
            char[] ch = s.get(i).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                count++;

            }
        }
        return count + (s.size() - 1);
    }

    public static int countOfLines(ArrayList<String> s) throws ArrayIndexOutOfBoundsException {
        return s.size();
    }

    public static int countOfWords(ArrayList<String> s) throws ArrayIndexOutOfBoundsException {

        int count = 0;
        for (int i = 0; i < s.size(); i++) {
            String[] str = s.get(i).split(" ");
            count += str.length;
        }
        return count;
    }

}
