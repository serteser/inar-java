package week_12.assignments.Question_12_24;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_23\\Salary.txt");

        if (!file.exists()) {
            System.out.println("File has not exist");
            System.exit(1);
        }

        ArrayList<String> data = new ArrayList<>();
        double assistantSalary = 0;
        int countsOfAssistants = 0;
        double associateSalary = 0;
        int countsOfAssociates = 0;
        double fullSalary = 0;
        int countsOfFullMembers = 0;

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {

                data.add(input.next());
                if (data.size() == 6) {
                    String s = data.get(5).replace(',', '.'); // comma must convert to the dot

                    if (data.get(4).equalsIgnoreCase("assistant")) {
                        assistantSalary += Double.parseDouble(s);
                        countsOfAssistants++;
                    }
                    if (data.get(4).equalsIgnoreCase("associate")) {
                        associateSalary += Double.parseDouble(s);
                        countsOfAssociates++;
                    }
                    if (data.get(4).equalsIgnoreCase("full")) {
                        fullSalary += Double.parseDouble(s);
                        countsOfFullMembers++;
                    }
                    data.clear();
                }
            }
            double forAllMembersSalary = assistantSalary + associateSalary + fullSalary;
            int countsOfAllMembers = countsOfAssistants + countsOfAssociates + countsOfFullMembers;
            System.out.printf("Total salary for assistant professors: %11.2f\n" +
                    "Total salary for associate professors: %11.2f\n" +
                    "Total salary for full professors     : %11.2f\n" +
                    "Total salary for all faculty         : %11.2f\n", assistantSalary, associateSalary, fullSalary, forAllMembersSalary);
            System.out.println("--------------------------------------------------");
            System.out.printf("Average salary for assistant professors: %8.2f\n" +
                            "Average salary for associate professors: %8.2f\n" +
                            "Average salary for full professors     : %8.2f\n" +
                            "Average salary for all faculty         : %8.2f\n", assistantSalary / countsOfAssistants, associateSalary / countsOfAssociates,
                    fullSalary / countsOfFullMembers, forAllMembersSalary / countsOfAllMembers);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
