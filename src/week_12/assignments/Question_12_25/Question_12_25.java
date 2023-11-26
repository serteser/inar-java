package week_12.assignments.Question_12_25;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {

        System.out.println("Enter a directory name: ");

        File file = new File(new Scanner(System.in).nextLine());

        if (!file.exists()) {
            file.mkdirs();
            System.out.println("Directory created successfully");
        }else {
            System.out.println("Directory already exists");
        }

    }
}
