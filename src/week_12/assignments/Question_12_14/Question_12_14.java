package week_12.assignments.Question_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args) {

        System.out.println("Enter a file's path name: "); // C:\\Users\\User\\Documents\\unspecified_numbers.txt
        File file = new File(new Scanner(System.in).nextLine());

        if (!file.exists()) {
            System.out.println("Source file does not exist");
            System.exit(1);
        }

        try {

            try (
                    Scanner input = new Scanner(file);
            ) {
                double sum = 0;
                int numberOfIntegers = 0;
                while (input.hasNext()) {
                    sum += input.nextInt();
                    numberOfIntegers++;
                }
                double average = sum / numberOfIntegers;
                System.out.printf("Sum of the numbers in the file: %5.2f\nNumber of Integers: %d\nAverage: %4.2f", sum, numberOfIntegers, average);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
