package week_04.assignments;

public class Question_04_09 {
    public static void main(String[] args) {

        // Write a statement that generates a number between 0-127 (inclusive 127).
        int ascııCode = (int) (Math.random() * 128);

        // A char can be casted into any numeric type, and vice versa...
        char ascıı = (char) ascııCode;

        System.out.println("\nEnter a character: " + ascıı);

        /** When you cast a char into a numeric type, the Unicode value of the character is cast into the
            specified numeric type.
         */

        int ch = (int) ascıı;

        System.out.println("The Unicode for the character " + ascıı + " is " + ch);


    }

}
