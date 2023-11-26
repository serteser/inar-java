package week_12.assignments.Question_12_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: : java Question_12_22 dir oldString newString");
            System.exit(1);
        }

        File directory = new File(args[0]); // C:\Users\User\Documents\changeable_files
        if (!directory.exists()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(2);
        }

//        ArrayList<String> fileLists = new ArrayList<>();
//
//        try (Scanner input = new Scanner(directory)) {
//
//            String str;
//            while (input.hasNext()) {
//                str = input.nextLine();
//                fileLists.add(str);
//            }
//            for (int i = 0; i < fileLists.size(); i++) {
//                System.out.println(fileLists.get(i) + " ");
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }

//        try (PrintWriter output = new PrintWriter(directory)) {
//
//            for (int i = 0; i < list.size(); i++) {
//                output.println(list.get(i));
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}
