package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputTransactions {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(System.getProperty("user.dir")+"/src/week_12/live_class/The_Secret_History.txt");
        System.out.println(file.getParent());

//        if(file.exists()){
//            System.out.println("File already exist.");
//            System.exit(1);
//        }
//        try(
//                PrintWriter output = new PrintWriter(file);
//
//                ){
//            output.print("I have read this book with great enthusiasm, and I recommend it to anyone who enjoy reading on crime, friendship, ancient Greek, philosophy...\n");
//            output.print("Do you curious on my age?");
//            output.print(" I'm ...\n");
//            output.print("43");
//            output.print(" years old.");
//        }
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String literal = input.nextLine();
            System.out.println(literal.replaceAll("I", "you"));
            //System.out.print(literal + " ");
        }

    }
}
