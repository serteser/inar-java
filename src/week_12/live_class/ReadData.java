package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("scores.txt");

        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String firstName = input.next();
            String midName = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + midName + " " + lastName + " " + score);
        }
        input.close();
        String lineSeparator = System.getProperty("line.Separator()");
    }
}
