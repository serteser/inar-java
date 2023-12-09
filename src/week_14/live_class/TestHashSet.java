package week_14.live_class;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Cactus");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        for (String s: set) {
            System.out.print(s.toUpperCase() + " ");
        }
    }
}
