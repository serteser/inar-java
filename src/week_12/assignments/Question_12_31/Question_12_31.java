package week_12.assignments.Question_12_31;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 2010; i >= 2001; i--) {

            try {
                URL url = new URL("https://liveexample.pearsoncmg.com/data/babynamesranking" + ("" + i) + ".txt");
                Scanner openInput = new Scanner(url.openStream());

                String[] result;
                String females = "";
                String males = "";
                int count = 0;

                while (count != 5) {

                    String line = openInput.nextLine();
                    result = line.split("\t+");
                    females += " " + result[3];
                    males += " " + result[1];
                    count++;
                }

                list.add(i + females + males);

                openInput.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        displayTable(list);

    }

    public static void displayTable(ArrayList<String> s) {

        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Year      Rank 1    Rank 2    Rank 3    Rank 4    Rank 5    Rank 1    Rank 2    Rank 3    Rank 4    Rank 5 ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < s.size(); i++) {

            String fr = s.get(i);
            String[] format = fr.split("\s+");
            System.out.printf("%-9s %-9s %-9s %-9s %-9s %-9s %-9s %-9s %-9s %-9s %-9s\n",
                    format[0], format[1], format[2], format[3], format[4], format[5],
                    format[6], format[7], format[8], format[9], format[10]);
        }
    }
}
