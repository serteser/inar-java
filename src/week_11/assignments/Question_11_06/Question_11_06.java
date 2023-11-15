package week_11.assignments.Question_11_06;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {

        Loan loan = new Loan(2.5, 1, 1000);
        Date date = new Date();
        Circle circle = new Circle();

        ArrayList<Object> collections = new ArrayList<>();
        collections.add(loan);
        collections.add(date);
        collections.add("InarAcademy");
        collections.add(circle);


        for (int i = 0; i < collections.size(); i++) {
            System.out.println(collections.get(i).toString());
            System.out.println("----------------------------");
        }
    }

}
