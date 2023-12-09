package week_12.assignments.Question_12_30;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_30 {
    public static void main(String[] args) throws MalformedURLException {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String year = input.nextLine();
        System.out.print("Enter the gender: ");
        String gender = input.nextLine();
        System.out.print("Enter the name: ");
        String name = input.nextLine();

        try {
            URL url = new URL("https://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt");
            Scanner openInput = new Scanner(url.openStream());

            String[] result;
            boolean isFound = false;

            while (openInput.hasNext()) {

                String line = openInput.nextLine();
                result = line.split("\t+");

                if ((gender.equalsIgnoreCase("m") && result[1].equalsIgnoreCase(name)) ||
                        gender.equalsIgnoreCase("f") && result[3].trim().equalsIgnoreCase(name)) {

                    System.out.printf("%s is ranked #%s in year %s ", name, result[0], year);
                    isFound = true;
                    break;

                }
            }
            if (!isFound) {
                System.out.printf("The name %s is not ranked in year %s ", name, year);
            }

            openInput.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
