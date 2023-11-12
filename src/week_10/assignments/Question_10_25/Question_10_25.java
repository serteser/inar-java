package week_10.assignments.Question_10_25;

import java.util.Arrays;

public class Question_10_25 {
    public static void main(String[] args) {

        String o = "Java#inar[aca]demy?";
        String[] n = split(o, "#][?");
        String[] result = eliminateFromNull(n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] split(String s, String regex) {
        String[] a = new String[s.length()];
        String result = "";
        String resultR = "";
        int indexString = 0;
        int count = 0;
        char chR = ' ';
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            for (int j = 0; j < regex.length(); j++) {
                chR = regex.charAt(j);
                if (chS == chR) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                result += chS;
                if (i == s.length() - 1) {
                    a[indexString] = result;
                }
            } else {
                resultR += chR;
                a[indexString] = result;
                a[++indexString] = resultR;
                result = "";
                resultR = "";
                count = 0;
                indexString++;
            }
        }
        return a;
    }

    public static int findIndexOfNull(String[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                index = i;
            }
        }
        return index;
    }

    public static String[] eliminateFromNull(String[] a) {
        int length = findIndexOfNull(a) + 1;
        String[] result = new String[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i];
        }
        return result;
    }
}
