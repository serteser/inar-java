package week_08.live_class;

import java.util.Arrays;

public class ThursdayExample {
    public static void main(String[] args) {
        String[][] capitals = new String[6][2];
        capitals[0] = new String[]{"Alabama", "Montgomery"};
        capitals[1] = new String[]{"Alaska", "Juneau"};
        capitals[2] = new String[]{"Arizona", "Phoenix"};
        capitals[3] = new String[]{"Arkansas", "Little Rock"};
        capitals[4] = new String[]{"California", "Sacramento"};
        capitals[5] = new String[]{"Colorado", "Denver"};
        System.out.println(Arrays.deepToString(capitals));
        shuffleList(capitals);
        System.out.println(Arrays.deepToString(capitals));
    }
    public static String[][] shuffleList(String[][] s) {
        String[] city ;
        for (int i = s.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i+1));
            city = s[s.length - 1];
            s[s.length - 1]= s[index];
            s[index]=city;
        }
        return s;
    }
}
