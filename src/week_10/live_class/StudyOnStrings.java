package week_10.live_class;

import java.math.BigInteger;
import java.util.Arrays;

public class StudyOnStrings {
    public static void main(String[] args) {
        String[] tokens = "big;grt;ser.ter.".split(";");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
        System.out.println();
        System.out.println("Welcome".replace('e', 'A')); // returns a new string, "WAlcomA."
        System.out.println("Welcome".replaceFirst("e", "AB")); //returns a new string, "WABlcome."
        System.out.println("Welcome".replaceAll("e", "AB")); //returns a new string, "WABlcomAB."
        System.out.println("Welcome".replace("el", "AB")); //returns a new string, "WABcome."

        System.out.println("Welcome to Java".lastIndexOf("Java", 5)); // returns -1
        String s ="The dentist has come to his office";
        System.out.println(s.substring(4));
        System.out.println(s.substring(4,12));
        System.out.println(s.length());

        int[] integer = {1, 2, 3};
        add(integer);
        System.out.println(Arrays.toString(integer));

        BigInteger a = new BigInteger("65465475757858768768765876587");
        System.out.println(add(a));
        //a = add(a);
        System.out.println(a);

        int b = 5;
        System.out.println(add(b));
        System.out.println(b);
    }

    public static BigInteger add(BigInteger a) {
        BigInteger t = new BigInteger("3");
        return a.add(t);
    }

    public static int add(int a) {
        return a + 5;
    }

    public static int[] add(int[] a) {
        a[0] = a[0] + 5;
        a[1] = a[1] + 5;
        a[2] = a[2] + 5;
        return a;
    }

}
