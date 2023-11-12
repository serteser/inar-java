package week_10.live_class;

import java.util.Arrays;

public class ConversionBetweenStringsAndArrays {
    public static void main(String[] args) {
        String r = "welcome to java";
       char[] array = r.toCharArray();
        System.out.println(array[6]);
        String s = "Pyre";
        s.getChars(0,s.length(),array,11);
        System.out.println(Arrays.toString(array));
        String g = new String(array);
        String fg = String.valueOf(array);
        System.out.println(g);
        System.out.println(fg);
        String k = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
        System.out.println(k);
        System.out.println(k.length());
        System.out.printf("%7.2f%6d%-4s", 45.556, 14, "AB");

    }
}
