package week_12.assignments.Question_12_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args) throws MalformedURLException {

        URL cranberry = new URL("https://en.wikipedia.org/wiki/The_Cranberries");

        System.out.printf("The total word number is %d in \nhttps://en.wikipedia.org/wiki/The_Cranberries", countsOfWords(cranberry));

    }

    public static int countsOfWords(URL url) {
        ArrayList<String> list = new ArrayList<>();

        try (Scanner input = new Scanner(url.openStream())) {
            while (input.hasNext()) {
                String s = input.next();
                list.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return list.size();
    }
}
