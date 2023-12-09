package week_14.assignments.Question_14_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a DNA Sequence: ");
        String s = input.nextLine();
        ArrayList<String> repeatedDNA = new ArrayList<>();

        for (int i = 0, k = i + 5; k < s.length(); i++, k++) {

            String subString = s.substring(i, k);
            for (int j = i + 1, m = j + 5; m < s.length(); j++, m++) {

                if (subString.equals(s.substring(j, m))) {
                    repeatedDNA.add(subString);
                    break;
                }
            }
        }
        System.out.println("Repeated 5-letter sequences: " + repeatedDNA);
    }
}
