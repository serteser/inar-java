package week_12.assignments.Question_12_23;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_23 {
    public static void main(String[] args) throws IOException {

        // Getting names from the net could make our task so easy!

        URL url = new URL("https://nlp100.github.io/data/popular-names.txt");
        Scanner input = new Scanner(url.openStream());
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        String[] ranks = {"assistant", "associate", "full"};
        String s;
        while (input.hasNext()) {
            s = input.next();
            char ch = s.charAt(0);
            if (s.length() != 1 && Character.isLetter(ch)) {
                firstName.add(s);
                lastName.add(s);
            }

            if (firstName.size() == 1000) {
                break;
            }
        }

        // Since we get the names, let's get back to local...

        File file = new File("C:\\Users\\User\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_23\\Salary.txt");

        if (!file.exists()) {
            System.out.println("File has not exist");
            System.exit(1);
        }
        Collections.sort(firstName);

        try (PrintWriter output = new PrintWriter(file)) {

            for (int i = 0; i < 1000; i++) {

                if (!firstName.get(i).equalsIgnoreCase(lastName.get(i))) {
                    int rank = (int) (Math.random() * 3);
                    output.printf("%-10s%d %-10s%d %-10s %-10.2f\n", firstName.get(i), (i + 1), lastName.get(i), (i + 1), ranks[rank], assignSalary(rank));
                }else {
                    int rank = (int) (Math.random() * 3);
                    output.printf("%-10s%d %-10s%d %-10s %-10.2f\n", firstName.get(i), (i + 1), lastName.get(i-1), (i + 1), ranks[rank], assignSalary(rank));
                }
            }


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double assignSalary(int i) {
        switch (i) {
            case 0:
                return (50000 + Math.random() * (80000 - 50000));
            case 1:
                return (60000 + Math.random() * (110000 - 60000));
            case 2:
                return (75000 + Math.random() * (130000 - 75000));
            default:
        }
        return i;
    }
}
