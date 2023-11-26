package week_12.live_class;

import java.net.MalformedURLException;
import java.net.URL;

public class ViewOnURL {
    public static void main(String[] args)  {

        try {
            URL url = new URL("http://www.google.com/index.html");
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

    }
}
