package week_12.live_class;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) throws IOException {
//        File file = new File("scores.txt");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.exists());
//
//        if(file.exists()){
//            System.out.println("File already exists");
//            System.exit(1);
//        }
//        PrintWriter output = new PrintWriter(file);
//        output.print("John T Smith ");
//        output.println(90);
//        output.print("Eric K Jones ");
//        output.println(85);
//        output.close();
            File file = new File("C:\\users\\user\\desktop\\home\\test.txt");
            //PrintWriter output = new PrintWriter(file);
            Scanner input = new Scanner(file);
            String s="";
            while(input.hasNext()){
                 s= input.nextLine();
                break;
            }
        System.out.println(s);
        System.out.println(s.length());
//        if(!file.exists()){
//            System.out.println("The file which is represented by the File object has not been existed...");
//
//        }else{
//            System.out.println("The file which is represented by the File object has been existed right now...");
//        }
        String s2 = "In";
        s2 = s2.toLowerCase();
        System.out.println(s2);
        System.out.println(s2.charAt(0)+1);


    }
}
