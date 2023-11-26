package week_12.live_class;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        output.close();



    }
}
