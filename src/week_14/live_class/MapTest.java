package week_14.live_class;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String, Integer> members = new HashMap<>();

        members.put("John", 16);
        members.put("Jade", 28);
        members.put("Johnie", 43);
        members.put("Johnie", 13);

        if(members.containsKey("Johnie")){
            System.out.println(members.get("John"));
            System.out.println(members.size());
        }else{
            System.out.println("The key is not included by members");
        }
        System.out.println(members);
        System.out.println(members.keySet());
        System.out.println(members.values());
        System.out.println("---------------------");
        System.out.println(members.entrySet());


    }
}
