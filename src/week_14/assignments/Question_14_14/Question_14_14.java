package week_14.assignments.Question_14_14;

import java.util.*;

public class Question_14_14 {
    public static void main(String[] args) {

        ArrayList<String> originalList = originalList();
        System.out.println("Original list of words: " + originalList);

        ArrayList<String> anagramList = anagramList(originalList);
        System.out.println("Anagram groups: " + anagramList);
    }

    public static ArrayList<String> originalList() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter words (enter -1 to finish) : ");
        String word = input.next();
        ArrayList<String> list = new ArrayList<>();

        while (!word.equals("-1")) {

            list.add(word);
            word = input.next();
        }
        return list;
    }

    public static boolean checkContents(String s1, String s2) {

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s1 = new String(ch1);
        s2 = new String(ch2);
        return s1.equals(s2);
    }

    public static ArrayList<String> anagramList(ArrayList<String> originalList) {

        HashSet<String> bucket = new HashSet<>(); // The bucket that holds the anagram group for each iteration
        ArrayList<String> pool = new ArrayList<>(); // The pool that holds all anagram groups for the presentation as an output

        for (int i = 0; i < originalList.size(); i++) {

            originalList.get(i);
            for (int j = i + 1; j < originalList.size(); j++) {

                if (checkContents(originalList.get(i), originalList.get(j))) {

                    bucket.add(originalList.get(i));
                    bucket.add(originalList.get(j));
                    originalList.remove(originalList.get(j));
                    j--;

                } else if (j == originalList.size() - 1 && bucket.isEmpty()) {

                    bucket.add(originalList.get(i));
                }
            }
            if (!bucket.isEmpty()) {

                pool.add(String.valueOf(bucket));
                bucket.clear(); // Do not forget to make the bucket ready for next filling
            }
        }
        return pool;
    }
}
