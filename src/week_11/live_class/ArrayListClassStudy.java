package week_11.live_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

import static java.lang.Integer.valueOf;

public class ArrayListClassStudy {
    public static void main(String[] args) {
        Integer[] str = {1,2,3,4,5};


        ArrayList<Integer> str1 = new ArrayList<> (Arrays.asList(str));

        System.out.println(str1);
        String[] hulk = new String[str1.size()];
        //str1.toArray(hulk);

        Integer number1 = valueOf("24");

        System.out.println("*********************************");
        String s = "fry";
        String s4 = "kite";
        String s2 = "ad";
        String s3 = "bag";
        String s1 = "bags";
        String s5 = "deliver";
        Date o = new Date();
        Integer number = 345;
        ArrayList<Object> collections = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add(s);
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        strings.add(s4);
        strings.add(2,s5);
        Collections.sort(strings);
        System.out.println(strings);
        System.out.println("*********************************");
        collections.add(s5);
        collections.add(o);

        collections.add(0,number);
        toString(collections);
        System.out.println(collections.indexOf(345));
        collections.add(3,number);
        System.out.println(collections.lastIndexOf(number));
        System.out.println(collections.isEmpty());
        System.out.println(collections.size());
        toString(collections);
        collections.set(0,o);
        toString(collections);
        collections.remove(number);
        toString(collections);
        collections.remove(number);
        System.out.println(s.equals(s1));
    }
    public static  void toString(ArrayList<Object> collections){
        for (int i = 0; i < collections.size() ; i++) {
            System.out.print(collections.get(i) + " / ");
        }
        System.out.println(collections.size());

    }


}
