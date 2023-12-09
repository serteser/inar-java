package week_14.live_class;

import java.util.HashMap;
import java.util.Map;

public class UnequalObjectsSameHashCode {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 11);
        map.put(4, 11);
        System.out.println(map.hashCode());

        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 11);
        map1.put(4, 11);
        System.out.println(map1.hashCode());

        if (map.equals(map1)) {
            System.out.println("equal ");
        }
    }
}
