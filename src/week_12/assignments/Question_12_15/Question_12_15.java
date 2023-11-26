package week_12.assignments.Question_12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_15\\Question_12_15.txt");

        if (file.exists()) {
            System.out.println("The file already exist.");
            System.out.println("The absolute path of the file is " + file.getAbsolutePath());

        }

        if (!file.exists()) {
            try {
                try (
                        PrintWriter output = new PrintWriter(file);
                ) {

                    for (int i = 0; i < 100; i++) {
                        output.print((int) (Math.random() * 100));
                        output.print(" ");
                    }

                }
            } catch (FileNotFoundException ex) {

                System.out.println(ex.getMessage());

            }


            try {
                try (
                        Scanner input = new Scanner(file);
                ) {
                    ArrayList<Integer> list = new ArrayList<>();
                    while (input.hasNext()) {
                        list.add(input.nextInt());
                    }
                    Collections.sort(list);
                    int count = 0;
                    for (int i = 0; i < list.size(); i++) {
                        System.out.printf("%3d", list.get(i));
                        count++;
                        if (count % 10 == 0) {
                            System.out.println();
                        }
                    }

                }
            } catch (FileNotFoundException ex) {

                System.out.println(ex.getMessage());

            }
        }
    }
}
