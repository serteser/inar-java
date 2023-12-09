package week_14.live_class;

public class DetectingDuplicateItems {
    public static void main(String[] args) {

        int[] numbers = {1, 7, 3, 5, 2, 9, 1, 2};

        if (isDuplicate(numbers)) {
            System.out.println("Yes it has duplicate number(s).");
        } else {
            System.out.println("No it is has not duplicate number(s).");
        }
    }

    public static boolean isDuplicate(int[] i) {

        boolean[] duplicate = new boolean[10];

        for (int j = 0; j < i.length; j++) {

            if (duplicate[i[j]]) {

                return true;
            } else {

                duplicate[i[j]] = true;
            }
        }
        return false;
    }

}
