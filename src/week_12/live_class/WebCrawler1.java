package week_12.live_class;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler1 {
    public static void main(String[] args) {

        String url = new Scanner(System.in).next();
        System.out.print("Enter a URL: ");
        crawler(url);
    }
    public static void crawler (String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while(!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size()<=100){
            String urlString = listOfPendingURLs.remove(0);

        }

//        URL url = new URL(startingURL);
//        Scanner input = new Scanner(url.openStream());


    }
}
