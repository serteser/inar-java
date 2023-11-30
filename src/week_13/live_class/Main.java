package week_13.live_class;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
        int x;

        Main(int x) {
            this.x = x;
        }
    public static void main(String[] args) {
        // creating two objects
        Main obj1 = new Main(5);
        Main obj2 = new Main(5);

        // hashcode of obj1
        System.out.println("obj1 = " + obj1);

        // hashcode of obj2
        System.out.println("obj2 = " + obj2);

        // comparing the two objects
        System.out.println("Comparing both the objects = " + (obj1.equals(obj2)));

        Calendar calendar = new GregorianCalendar(2013, 2, 1);
         Calendar calendar1 = calendar;
         Calendar calendar2 = (Calendar)calendar.clone();
         System.out.println("calendar == calendar1 is " +
                 (calendar == calendar1));
         System.out.println("calendar == calendar2 is " +
                 (calendar == calendar2));
         System.out.println("calendar.equals(calendar2) is " +
                 calendar.equals(calendar2));
    }

}
