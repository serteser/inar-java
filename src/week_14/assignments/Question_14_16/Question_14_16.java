package week_14.assignments.Question_14_16;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Question_14_16 {
    public static void main(String[] args) {

        System.out.println("Enter the file path: ");
        String filePath = new Scanner(System.in).nextLine();
        File file = new File(filePath);            //"C:\\Users\\User\\Workspace\\inar-java\\src\\week_14\\assignments\\Question_14_16\\file.txt");
        Map<String, Integer> map = new TreeMap<>(); // We prefer TreeMap since we want an alphabetic order

        if (!file.exists()) {

            System.out.println("Please check the file path");
            System.exit(1);
        }

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {

                String text = input.nextLine();
                String[] words = text.split("[ \n\t\r.,:;!'?%&${\\[=}()\\]\"]");

                for (int i = 0; i < words.length; i++) {

                    String key = words[i].toLowerCase();
                    if (key.length() > 0) {
                        if (!map.containsKey(key)) {

                            map.put(key, 1);
                        } else {
                            int value = map.get(key);
                            value++;
                            map.put(key, value);
                        }
                    }

                }


            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("Word count: ");
        for (Map.Entry<String, Integer> entry : entrySet) {

            System.out.printf("%-16s %2d\n", entry.getKey(), entry.getValue());
        }


    }
}
