package week_12.live_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesStatement {
    public static void main(String[] args) {

    }
     // The try-with-resources Statement
    static String readFirstLineFromFile(String path) throws IOException {
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {

            return br.readLine();

        }
    }

    // Using a finally-block instead of a try-with-resources statement:
    static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        try {
            return br.readLine();
        } finally {
            br.close();
            fr.close();
        }
    }
}
