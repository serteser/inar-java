package week_12.assignments.Question_12_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Question_12_18 {
    public static void main(String[] args) {
        /* C:\Users\User\workspace\inar-java\src\week_12\assignments\Question_12_18\srcRootDirectory>
         *
         *
         *
         *
         *
         *
         *
         * */


        String rootPath = "C:\\Users\\User\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_18\\" + args[0] + "\\Chapter.java";
        File file = new File(rootPath);
//        System.out.println(file.getAbsolutePath());

        if (args.length != 1) {
            System.out.println("Usage: java Question_12_18 srcRootDirectory");
            System.exit(1);
        }

        if(file.exists()){
            System.out.println("The file " + args[0] + "has already exist.");
            System.exit(2);
        }
        try(PrintWriter output = new PrintWriter(file)){
            output.print("Hi everyone!");
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
