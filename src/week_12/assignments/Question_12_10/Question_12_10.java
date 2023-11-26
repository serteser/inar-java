package week_12.assignments.Question_12_10;

import java.util.ArrayList;

public class Question_12_10 {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();

        try {
            for (int i = 0; i < 1000000000L; i++) {

                objects.add(i);
            }
        } catch (OutOfMemoryError ex) {

            System.out.println("OutOfMemoryException occurs! :" + ex.getMessage());
        }
    }
}
