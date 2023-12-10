package week_14.assignments.Question_14_26;

import java.math.BigInteger;
import java.util.LinkedList;

public class Question_14_26 {
    public static void main(String[] args) {

        LinkedList<BigInteger> linkedList = getList();
        System.out.println("Original Linked List: " + linkedList);

        System.out.println("Updated Linked List: ");
        System.out.println(addGCD(linkedList));
    }

    public static LinkedList<BigInteger> getList() {

        LinkedList<BigInteger> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {

            String s = "" + (int) (Math.random() * 100);
            linkedList.add(new BigInteger(s));
        }
        return linkedList;
    }

    public static LinkedList<BigInteger> addGCD(LinkedList<BigInteger> number) {

        for (int i = 1; i < number.size(); i += 2) {

            number.add(i, number.get(i - 1).gcd(number.get(i)));
        }
        return number;
    }
}
