package week_14.live_class;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest extends Object {
    public static void main(String[] args) {



        Integer[] numbers = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(numbers));
        intList.trimToSize();

        String s = "freddy";

        for (int i = s.length()-1; i >= 0 ; i--) {

            char ch = s.charAt(i);
            System.out.print(ch + " ");
        }
    }
}
